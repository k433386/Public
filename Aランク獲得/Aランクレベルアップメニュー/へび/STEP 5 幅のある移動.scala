import scala.io.StdIn._

object Main extends App {
 
    val line = readLine().split(" ")
    val H = line(0).toInt
    val W = line(1).toInt
    val sy = line(2).toInt
    val sx = line(3).toInt
    val N = line(4).toInt
    val Sh = Array.ofDim[String](H, W)
    val Dn = Array.ofDim[String](N, 2)
    
    for (i <- 0 until H){
        Sh(i) = readLine().split("")
    }
    for (i <- 0 until N){
        Dn(i) = readLine().split(" ")
    }

    def noObject(y: Int, x: Int) : Boolean = {
        return (Sh(y)(x) != "#")
    }
    def inMap(y: Int, x: Int) : Boolean = {
        if (0 <= y && y < H && 0 <= x && x < W){
            return noObject(y, x)
        } else {
            return false
        }
    }
    def nextPlot(m: String, y: Int, x: Int) : (Int, Int, String) = {
        val (a, b, dir) = m match{
            case "N" => (y-1, x, "N")
            case "S" => (y+1, x, "S")
            case "W" => (y, x-1, "W")
            case "E" => (y, x+1, "E")
        }
        return (a, b, dir)
    }
    def headDir(dir: String, rl: String, y: Int, x: Int) : (Int, Int, String) = {
        val nowdir = rl match{
            case "R" => dir match{
                case "N" => "E"
                case "S" => "W"
                case "W" => "N"
                case "E" => "S"
            }
            case "L" => dir match{
                case "N" => "W"
                case "S" => "E"
                case "W" => "S"
                case "E" => "N"
            }
        }
        nextPlot(nowdir, y, x)
    }

    def mainFunc():Array[(Int, Int)] = {
        var m = "N"
        var y = sy
        var x = sx
        var dir = ""
        var result: Array[(Int, Int)] = Array.empty
        
        result = result ++ Array((y, x))
        for (Array(d, step) <- Dn){
            var tmp = true
            for (_ <- 0 until step.toInt){
                val (newY, newX, newDir) = headDir(m, d, y, x)
                if (!(inMap(newY, newX))){
                    result = result ++ Array((y, x))
                    return result
                }
                y = newY
                x = newX
                dir = newDir
            }
            result = result ++ Array((y, x))
            m = dir
        }
        return result
    }
    def printout(result: Array[(Int, Int)]) = {
        for (tmp <- result.sliding(2).toList){
            val (fromY, fromX) = tmp(0)
            val (toY, toX) = tmp(1)

            val xlist = (Array(fromX, toX).min to Array(fromX, toX).max)
            val ylist = (Array(fromY, toY).min to Array(fromY, toY).max)
            for ((i, j) <- ylist.zipAll(xlist, fromY, fromX)){
                Sh(i)(j) = "*"
            }
        }
        for (i <- Sh){
            println(i.mkString(""))
        }
    }

    printout(mainFunc())
}

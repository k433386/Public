import scala.io.StdIn._

object Main extends App {
 
    val line = readLine().split(" ")
    val H = line(0).toInt
    val W = line(1).toInt
    val sy = line(2).toInt
    val sx = line(3).toInt
    val N = line(4).toInt
    val Sh = Array.ofDim[String](H, W)
    var tdN : Map[Int, String] = Map.empty
    
    for (i <- 0 until H){
        Sh(i) = readLine().split("")
    }
    for (i <- 0 until N){
        val Array(t, d) = readLine().split(" ")
        tdN = tdN ++ Map(t.toInt -> d)
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
            case "N" => dir
        }
        nextPlot(nowdir, y, x)
    }

    def mainFunc(): Unit = {
        var m = "N"
        var y = sy
        var x = sx
        for (i <- 0 until 100){
            val d = if (tdN.contains(i)){
                tdN(i)
            } else {
                "N"
            }
            val (newY, newX, dir) = headDir(m, d, y, x)
            if (!(inMap(newY, newX))){
                println("Stop")
                return
            } else {
                println(s"${newY} ${newX}")
                m = dir
                y = newY
                x = newX
            }
        }
    }
    mainFunc()
}
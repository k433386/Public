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

    def mainFunc(): Unit = {
        var m = "N"
        var y = sy
        var x = sx
        var dir = ""
        for (Array(d, step) <- Dn){
            var tmp = true
            for (_ <- 0 until step.toInt){
                val (newY, newX, newDir) = headDir(m, d, y, x)
                if (!(inMap(newY, newX))){
                    println(s"${y} ${x}")
                    println("Stop")
                    return
                }
                y = newY
                x = newX
                dir = newDir             
            }
            println(s"${y} ${x}")
            m = dir
        }                
    }
    mainFunc() 
}



/*
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

    def inMap(y: Int, x: Int, oldy: Int, oldx: Int) : (Boolean, Boolean) = {
        def noObject(y: Int, x: Int) : Boolean = {
            return (Sh(y)(x) != "#")
        }

        if (0 <= y && y < H && 0 <= x && x < W){
            val xlist = (Array(x, oldx).min to Array(x, oldx).max)
            val ylist = (Array(y, oldy).min to Array(x, oldy).max)
            var tmp = true
            for ((i, j) <- ylist.zipAll(xlist, y, x)){
                val check = noObject(i, j) 
                if (tmp && !check){
                    tmp = check
                }
            }
            if (tmp){
                return (true, true)
            } else {
                return (true, false)
            }
        } else {
            val nx = {
                if(x < 0){ 0 }
                else if (x >= W){ W-1 }
                else { x }
            }
            val ny = {
                if(y < 0){ 0 }
                else if (y >= H){ H-1 }
                else { y }
            }
            val xlist = (Array(x, oldx, nx).filter(_ >= 0).min to Array(x, oldx, nx).filter(_ < W).max)
            val ylist = (Array(y, oldy, ny).filter(_ >= 0).min to Array(x, oldy, ny).filter(_ < H).max)
            var tmp = true
            for ((i, j) <- ylist.zipAll(xlist, y, x)){
                val check = noObject(i, j) 
                if (tmp && !check){
                    tmp = check
                }
            }
            if (tmp){
                return (false, true)
            } else {
                return (false, false)
            }
        }
    }
    def nextPlot(m: String, step: Int, y: Int, x: Int) : (Int, Int, String) = {
        val (a, b, dir) = m match{
            case "N" => (y-step, x, "N")
            case "S" => (y+step, x, "S")
            case "W" => (y, x-step, "W")
            case "E" => (y, x+step, "E")
        }
        return (a, b, dir)
    }
    def headDir(dir: String, rl: String, step: Int, y: Int, x: Int) : (Int, Int, String) = {
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
        nextPlot(nowdir, step, y, x)
    }

    def mainFunc(): Unit = {
        var m = "N"
        var y = sy
        var x = sx
        for (Array(d, step) <- Dn){
            val (newY, newX, dir) = headDir(m, d, step.toInt, y, x)
            val (inM, colis) = inMap(newY, newX, y, x)
            if (inM && colis){
                println(s"${newY} ${newX}")
                m = dir
                y = newY
                x = newX
            } else if (!(colis)){
                for (i <- step.toInt-1 to 1 by -1){
                    val (repY, repX, _) = headDir(m, d, i, y, x)
                    val (_, repColis) = inMap(repY, repX, y, x)
                    if(repColis){
                        println(s"${repY} ${repX}")
                        println("Stop")
                        return 
                    }
                }
            } else if (!(inM)) {
                val resX = {
                    if(newX < 0){ 0 }
                    else if (newX >= W){ W-1 }
                    else { newX }
                }
                val resY = {
                    if(newY < 0){ 0 }
                    else if (newY >= H){ H-1 }
                    else { newY }
                }
                println(s"${resY} ${resX}")
                println("Stop")
                return
            }
        }
    }
    mainFunc()
}
*/
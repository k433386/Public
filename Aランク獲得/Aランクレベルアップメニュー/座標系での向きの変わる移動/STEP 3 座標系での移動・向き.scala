import scala.io.StdIn._

object Main extends App {
    
    val YXD = readLine().split(" ")
    var Y = YXD(0).toInt
    var X = YXD(1).toInt
    val D = YXD(2)
    val d = readLine()

    turning(D, d, Y, X)
    println(s"${Y} ${X}")

    def moving(dir: String, y: Int, x: Int) : Unit = {
        if (dir == "N"){
            Y = y-1
            X = x
        }
        if (dir == "S"){
            Y = y+1
            X = x
        }
        if (dir == "E"){
            Y = y
            X = x+1
        }
        if (dir == "W"){
            Y = y
            X = x-1
        }
    }
    def turning(dir: String, rl: String, y: Int, x: Int) : Unit = {
        var newdir = ""
        if (rl == "R"){
            if(dir == "N"){
                newdir = "E"
            } else if(dir == "S"){
                newdir = "W"
            } else if(dir == "E"){
                newdir = "S"
            } else if(dir == "W"){
                newdir = "N"
            }
        }
        if (rl == "L"){
            if(dir == "N"){
                newdir = "W"
            } else if(dir == "S"){
                newdir = "E"
            } else if(dir == "E"){
                newdir = "N"
            } else if(dir == "W"){
                newdir = "S"
            }
        }
        moving(newdir, y, x)
    }
}

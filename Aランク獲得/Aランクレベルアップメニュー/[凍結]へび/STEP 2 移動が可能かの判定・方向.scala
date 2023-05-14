import scala.io.StdIn._

object Main extends App {
 
    val line = readLine().split(" ")
    val H = line(0).toInt
    val W = line(1).toInt
    val sy = line(2).toInt
    val sx = line(3).toInt
    val d = line(4)
    val m = line(5)
    val Sh = Array.ofDim[String](H, W)

    for (i <- 0 until H){
        Sh(i) = readLine().split(" ")
    }

    def nextPlot(m: String, y: Int, x: Int) : (Int, Int) = {
        if (m == "N"){
            (y-1, x)
        }
        else if (m == "S"){
            (y+1, x)
        }
        else if (m == "E"){
            (y, x+1)
        }
        else if (m == "W"){
            (y, x-1)
        }
        else { (y, x) }
    }
    def headDir(dir: String, rl: String, y: Int, x: Int) : (Int, Int) = {
        val nowdir =if (rl == "R"){
                        if(dir == "N"){
                            "E"
                        } else if(dir == "S"){
                            "W"
                        } else if(dir == "E"){
                            "S"
                        } else if(dir == "W"){
                            "N"
                        } else { dir }
                    }
                    else if (rl == "L"){
                        if(dir == "N"){
                            "W"
                        } else if(dir == "S"){
                            "E"
                        } else if(dir == "E"){
                            "N"
                        } else if(dir == "W"){
                            "S"
                        } else { dir }
                    }
                    else { dir }

        nextPlot(nowdir.toString, y, x)
    }

    val (newY, newX) = headDir(d, m, sy, sx)
    if (0 <= newY && newY < H && 0 <= newX && newX < W && Sh(newY)(newX) != "#") { println("Yes") } 
    else { println("No")}
}

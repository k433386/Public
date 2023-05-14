import scala.io.StdIn._

object Main extends App {
    
    val YXN = readLine().split(" ").map(_.toInt)
    var Y = YXN(0)
    var X = YXN(1)
    val N = YXN(2)

    for(i <- 0 until N){
        val Dn = readLine()
        moving(Dn, Y, X)
        println(s"${Y} ${X}")
    }

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
}

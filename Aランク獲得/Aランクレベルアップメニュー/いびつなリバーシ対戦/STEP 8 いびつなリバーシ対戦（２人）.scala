import scala.io.StdIn._

object Main extends App {
    val Array(h, w, n) = readLine().split(" ").map(_.toInt)
    val s = Array.ofDim[String](h, w)

    for (y <- 0 until h) {
        s(y) = readLine().split("")
    }

    def checkRow(x: Int, y: Int, s: Array[Array[String]], turn: String): Unit = {
        for (lr <- List(-1, 1)) {
            innerFunc()
            def innerFunc(): Unit = {
                var i = 0
                while (true) {
                    i = i + 1
                    if (x + i * lr < 0 || x + i * lr >= w) {
                        return
                    }
                    if (s(y)(x + i * lr) == "#") {
                        return
                    }
                    else if (s(y)(x + i * lr) == turn) {
                        for (j <- (Array(x + i * lr, x).min to Array(x + i * lr, x).max)) {
                            s(y)(j) = turn
                        }
                        return
                    }
                }
            }
        }
    }

    def checkColumn(x: Int, y: Int, s: Array[Array[String]], turn: String): Unit = {
        for (lr <- List(-1, 1)) {
            innerFunc()
            def innerFunc(): Unit = {
                var i = 0
                while (true) {
                    i = i + 1
                    if (y + i * lr < 0 || y + i * lr >= h) {
                        return
                    }
                    if (s(y + i * lr)(x) == "#") {
                        return 
                    }
                    else if (s(y + i * lr)(x) == turn) {
                        for (j <- (Array(y + i * lr, y).min to Array(y + i * lr, y).max)) {
                            s(j)(x) = turn
                        }
                        return
                    }
                }
            }
        }
    }

    def checkCross(x: Int, y: Int, s: Array[Array[String]], turn: String): Unit = {
        for (lr <- List(List(-1, -1), List(1, -1), List(-1, 1), List(1, 1))) {
            innerFunc()
            def innerFunc(): Unit = {
                var i = 0
                while (true) {
                    i = i + 1
                    if (y + i * lr(0) < 0 || y + i * lr(0) >= h) {
                        return
                    }
                    if (x + i * lr(1) < 0 || x + i * lr(1) >= w) {
                        return
                    }
                    if (s(y + i * lr(0))(x + i * lr(1)) == "#"){
                        return 
                    }
                    else if (s(y + i * lr(0))(x + i * lr(1)) == turn) {
                        for (j <- 0 until i) {
                            s(y+lr(0)*j)(x+lr(1)*j) = turn
                        }
                        return
                    }
                }
            }
        }
    }

    for (i <- 0 until n*2){
        val Array(y, x) = readLine().split(" ").map(_.toInt)
        val turn = if(i%2 == 0){ "A" } else { "B" }
        checkRow(x, y, s, turn)
        checkColumn(x, y, s, turn)
        checkCross(x, y, s, turn)
        s(y)(x) = turn
    }

    def printOut() = {
        for (i <- s){
            println(i.mkString(""))
        }        
    }
    printOut()
}
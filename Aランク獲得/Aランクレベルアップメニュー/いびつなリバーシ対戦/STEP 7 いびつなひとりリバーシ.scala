import scala.io.StdIn._

object Main extends App {
    val Array(h, w, n) = readLine().split(" ").map(_.toInt)
    val s = Array.ofDim[String](h, w)

    for (y <- 0 until h) {
        s(y) = readLine().split("")
    }

    def checkRow(x: Int, y: Int, s: Array[Array[String]]): Unit = {
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
                    else if (s(y)(x + i * lr) == "*") {
                        for (j <- (Array(x + i * lr, x).min to Array(x + i * lr, x).max)) {
                            s(y)(j) = "*"
                        }
                        return
                    }
                }
            }
        }
    }

    def checkColumn(x: Int, y: Int, s: Array[Array[String]]): Unit = {
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
                    else if (s(y + i * lr)(x) == "*") {
                        for (j <- (Array(y + i * lr, y).min to Array(y + i * lr, y).max)) {
                            s(j)(x) = "*"
                        }
                        return
                    }
                }
            }
        }
    }

    def checkCross(x: Int, y: Int, s: Array[Array[String]]): Unit = {
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
                    else if (s(y + i * lr(0))(x + i * lr(1)) == "*") {
                        for (j <- 0 until i) {
                            s(y+lr(0)*j)(x+lr(1)*j) = "*"
                        }
                        return
                    }
                }
            }
        }
    }

    for (i <- 0 until n){
        val Array(y, x) = readLine().split(" ").map(_.toInt)
        checkRow(x, y, s)
        checkColumn(x, y, s)
        checkCross(x, y, s)
        s(y)(x) = "*"
    }

    for (i <- s){
        println(i.mkString(""))
    }
}
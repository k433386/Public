import scala.io.StdIn._

object Main extends App {
    val Array(h, w, y, x) = readLine().split(" ").map(_.toInt)
    val s = Array.ofDim[String](h, w)

    for (y <- 0 until h) {
        s(y) = readLine().split("")
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
                    if (s(y + i * lr(0))(x + i * lr(1)) == "*") {
                        for (j <- 0 until i) {
                            s(y+lr(0)*j)(x+lr(1)*j) = "*"
                        }
                        return
                    }
                }
            }
        }
    }

    checkCross(y, x, s)
    s(y)(x) = "*"
    for (i <- s){
        println(i.mkString(""))
    }
}
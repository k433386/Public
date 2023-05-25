import scala.io.StdIn._

object Main extends App {

    val Array(n, m, h, x) = readLine().split(" ").map(_.toInt)

    def countUp() = {
        var count = 0
        for (i <- 0 until h; j <- 0 until n){
            count = count + readLine().split(" ").map(_.toInt).count(_ == x)
        }
        println(count)
    }
    countUp()
}

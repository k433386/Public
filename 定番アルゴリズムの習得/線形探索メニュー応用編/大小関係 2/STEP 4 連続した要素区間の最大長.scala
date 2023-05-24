import scala.io.StdIn._

object Main extends App {

    val Array(n, x) = readLine().split(" ").map(_.toInt)
    val a = readLine().split(" ").map(_.toInt)

    def maxLength(a: Array[Int], x: Int): Int = {
        var max = 0
        var current = 0

        for (num <- a) {
            if (num < x) {
                current = current + 1
                max = Array(max, current).max
            } else {
                current = 0
            }
        }
        return max
    }

    val result = maxLength(a, x)
    println(result)
}
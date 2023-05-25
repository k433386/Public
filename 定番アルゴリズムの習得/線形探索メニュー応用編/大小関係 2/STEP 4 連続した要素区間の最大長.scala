import scala.io.StdIn._

object Main extends App {

    val n = readLine().toInt
    val a = readLine().split(" ").map(_.toInt)

    def maxLength(a: Array[Int]): Int = {
        var max = 0
        var current = 0
        var tmp = a(0)

        for (num <- a) {
            if (num == tmp) {
                current = current + 1
                max = Array(max, current).max
            } else {
                current = 1
                tmp = num
            }
        }
        return max
    }

    val result = maxLength(a)
    println(result)
}
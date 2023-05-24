import scala.io.StdIn._

object Main extends App {

    val Array(n, x, k) = readLine().split(" ").map(_.toInt)
    val an = readLine().split(" ").map(_.toInt)

    def countUp() = {
        var count = 0
        for (i <- an.sliding(k).toList){
            if (i.length == i.count(_ == x)){
                count = count + 1
            }
        }
        println(count)
    }
    countUp()
}
import scala.io.StdIn._

object Main extends App {

    val n = readLine().toInt
    val an = readLine().split(" ").map(_.toInt)

    def countUp() = {
        var count = 0
        for (i <- an.sliding(3).toList){
            if (i(0) < i(1) && i(1) > i(2)){
                count = count + 1
            }
            if (i(0) > i(1) && i(1) < i(2)){
                count = count + 1
            }
        }
        println(count)
    }
    countUp()
}
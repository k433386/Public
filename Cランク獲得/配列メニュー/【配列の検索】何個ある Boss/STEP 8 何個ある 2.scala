import scala.io.StdIn._

object Main extends App {

    val num = readLine().toInt
    val line = Array(1, 2, 5, 1, 4, 3, 2, 5, 1, 4)
    var count = 0

    for (i <- 0 until line.length){
        if (line(i) == num){
            count = count + 1
        }
    }
    println(count)
}

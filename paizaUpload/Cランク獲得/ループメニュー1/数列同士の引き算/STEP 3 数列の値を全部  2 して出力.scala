import scala.io.StdIn._

object Main extends App {

    val num = readLine().toInt
    val line = readLine().split(" ")
    var result = 0

    for (i <- 0 until num){
        println(line(i).toInt*2)
    }
}

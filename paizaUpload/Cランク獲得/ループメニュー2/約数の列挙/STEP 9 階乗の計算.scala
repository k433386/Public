import scala.io.StdIn._

object Main extends App {

    val num = readLine().toInt
    var result = 1

    for (i <- 1 to num){
        result = result * i
    }
    println(result)
}

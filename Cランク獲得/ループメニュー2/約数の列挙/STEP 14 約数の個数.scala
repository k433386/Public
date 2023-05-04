import scala.io.StdIn._

object Main extends App {

    val num = readLine().toInt
    var count = 0

    for (i <- 1 to num){
        if (num % i == 0){
            count = count + 1
        }
    }
    println(count)
}

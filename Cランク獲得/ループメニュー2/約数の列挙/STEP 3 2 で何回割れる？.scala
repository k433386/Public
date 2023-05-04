import scala.io.StdIn._

object Main extends App {

    var num = readLine().toInt
    var count = 0

    while (num % 2 == 0){
        count = count + 1
        num = num / 2
    }
    println(count)
}

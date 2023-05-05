import scala.io.StdIn._

object Main extends App {

    val num = readLine().toInt
    val line = readLine().split(" ").map(_.toInt)
    val sum = line.sum

    for (i <- line){
        if (i >= sum/num){
            println(i)
        }
    }
}

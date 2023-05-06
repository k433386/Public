import scala.io.StdIn._

object Main extends App {

    val num = readLine().toInt
    var sum = 0

    for (i <- 0 until num){
        val Anum = readLine().toInt
        sum = sum + Anum
    }
    println(sum)
}
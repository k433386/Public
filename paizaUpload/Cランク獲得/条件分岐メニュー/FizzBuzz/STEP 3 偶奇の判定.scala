import scala.io.StdIn._

object Main extends App {

    val num = readLine().toInt
    val numA = readLine().split(" ")
    var E = 0
    var O = 0

    for (i <- 0 until num){
        if (numA(i).toInt%2 == 0){
            E = E + 1
        } else {
            O = O + 1
        }
    }
    println(s"${E} ${O}")
}

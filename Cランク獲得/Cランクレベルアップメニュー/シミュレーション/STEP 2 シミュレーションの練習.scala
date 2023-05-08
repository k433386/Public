import scala.io.StdIn._

object Main extends App {

    val n = readLine().toInt
    val ab = readLine().split(" ")
    val a = ab(0).toInt
    val b = ab(1).toInt
    var aP = 1
    var bP = 1
    var count = 0

    while (n >= bP){
        bP = bP + aP * a
        aP = aP + bP % b
        count = count + 1
    }
    println(count)
}
import scala.io.StdIn._

object Main extends App {

    val n = readLine().toInt
    var Aline = Array.ofDim[Int](n)

    for (i <- 0 until n){
        Aline(i) = readLine().toInt
    }
    val Bline = Aline.sorted.reverse

    for (i <- Bline){
        println(i)
    }
}
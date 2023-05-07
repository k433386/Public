import scala.io.StdIn._

object Main extends App {

    val N = readLine().toInt
    var Aline = Array.ofDim[Int](N, N)

    for (i <- 0 until N){
        Aline(i) = (1 to i+1).toArray
    }
    for (i <- Aline){
        println(i.mkString(" "))
    }
}
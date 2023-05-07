import scala.io.StdIn._

object Main extends App {

    val N = readLine().toInt
    var Aline = Array.ofDim[Int](N,100)

    for (i <- 0 until N){
        Aline(i) = readLine().split(" ").map(_.toInt)
    }
    for (i <- Aline){
        println(i.drop(1).sum)
    }
}
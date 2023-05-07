import scala.io.StdIn._

object Main extends App {

    val line = readLine().split(" ")
    val N = line(0).toInt
    val K = line(1).toInt
    var Aline = Array.ofDim[Int](N,1)

    for (i <- 0 until N){
        Aline(i) = Array(readLine().split(" ").map(_.toInt).sum)
    }
    for (i <- Aline){
        println(i.mkString(""))
    }
}
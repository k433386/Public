import scala.io.StdIn._

object Main extends App {

    val line = readLine().split(" ")
    val N = line(0).toInt
    val K = line(1).toInt
    var Aline = Array.ofDim[Int](N, 1)
    var tmp = 0

    for (i <- 0 until N){
        Aline(i) = readLine().split(" ").map(_.toInt)
    }
    for (i <- Aline){
        if (i.max > tmp){
            tmp = i.max
        }
    }
    println(tmp)
}
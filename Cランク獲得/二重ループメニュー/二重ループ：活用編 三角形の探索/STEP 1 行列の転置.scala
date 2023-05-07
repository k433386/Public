import scala.io.StdIn._

object Main extends App {

    val line = readLine().split(" ")
    val N = line(0).toInt
    val K = line(1).toInt
    var Aline = Array.ofDim[Int](N, K)
    var Bline = Array.ofDim[Int](K, N)

    for (i <- 0 until N){
        Aline(i) = readLine().split(" ").map(_.toInt)
    }
    for (i <-0 until N){
        for (j <-0 until K){
            Bline(j)(i) = Aline(i)(j)
        }
    }

    for(i <- Bline){
        println(i.mkString(" "))
    }
}
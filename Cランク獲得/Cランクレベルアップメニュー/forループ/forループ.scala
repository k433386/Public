import scala.io.StdIn._

object Main extends App {

    val line = readLine().split(" ").map(_.toInt)
    val N = line(0)
    val M = line(1)
    val K = line(2)
    var Aline = Array.ofDim[Int](N,M)

    for (i <- 0 until N){
        Aline(i) = readLine().split(" ").map(_.toInt)
    }
    
    for (i <- Aline){
        var count = 0
        for (j <- i){
            if (j == K){
                count = count + 1
            }
        }
        println(count)
    }
}

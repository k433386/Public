import scala.io.StdIn._

object Main extends App {

    val line = readLine().split(" ")
    val N = line(0).toInt
    val K = line(1).toInt
    var Aline = Array.ofDim[String](N, K)

    for (i <- 0 until N){
        Aline(i) = readLine().split(" ")
    }
    for (i <-0 until N){
        for (j <- 0 until K){
            if (Aline(i)(j) == "1"){
                println(s"${i+1} ${j+1}")
            }
        }
    }
}
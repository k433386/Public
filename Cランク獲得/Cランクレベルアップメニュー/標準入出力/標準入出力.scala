import scala.io.StdIn._

object Main extends App {

    val N = readLine().toInt 
    var Sline = Array.ofDim[String](N, 2)

    for (i <- 0 until N){
        Sline(i) = readLine().split(" ")
    }
    for (i <- Sline){
        println(s"${i(0)} ${i(1).toInt+1}")
    }
}

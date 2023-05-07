import scala.io.StdIn._

object Main extends App {

    val n = readLine().toInt
    var Sline = Array.ofDim[String](n,2)

    for (i <- 0 until n){
        Sline(i) = readLine().split(" ")
    }
    
    val S = readLine()

    for (i <- Sline){
        if (i(0) == S){
            println(i(1))
        }
    }    
}

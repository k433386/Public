import scala.io.StdIn._

object Main extends App {

    val N = readLine().toInt 
    var Aline = Array.ofDim[String](N)

    for (i <- 0 until N){
        Aline(i) = readLine()
    }
    for (i <- Aline){
        println(s"${i.length}")
    }
}

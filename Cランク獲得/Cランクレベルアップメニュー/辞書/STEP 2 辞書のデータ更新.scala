import scala.io.StdIn._

object Main extends App {

    val n = readLine().toInt
    var Sline = Array.ofDim[String](n)

    for (i <- 0 until n){
        Sline(i) = readLine()
    }
    
    val m = readLine().toInt
    var Pline = Array.ofDim[String](m,2)

    for (i <- 0 until m){
        Pline(i) = readLine().split(" ")
    }

    val S = readLine()
    var count = 0

    for (i <- Pline){
        if (i(0) == S){
            count = count + i(1).toInt
        }
    }
    println(count)
}

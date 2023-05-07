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

    for (i <- Sline.sorted){
        var count = 0
        for (j <- Pline){
            if (i == j(0)){
                count = count + j(1).toInt
            }
        }
        println(count)
    }
}

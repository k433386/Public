import scala.io.StdIn._

object Main extends App {

    val m = readLine().toInt
    var Cline = Array.ofDim[String](m)

    for (i <- 0 until m){
        Cline(i) = readLine()
    }
    
    val n = readLine().toInt
    var Sline = Array.ofDim[String](n)

    for (i <- 0 until n){
        Sline(i) = readLine()
    }
    
    for (i <- Cline){
        for (j <- Sline){
            if (j.contains(i)){
                println("YES")
            } else {
                println("NO")
            }
        }
    }
}

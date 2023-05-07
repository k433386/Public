import scala.io.StdIn._

object Main extends App {

    val n = readLine().toInt
    var Aline = Array.ofDim[String](n)

    for (i <- 0 until n){
        Aline(i) = readLine()
    }
    
    if (Aline.contains("7")){
        println("YES")
    } else {
        println("NO")
    }
}

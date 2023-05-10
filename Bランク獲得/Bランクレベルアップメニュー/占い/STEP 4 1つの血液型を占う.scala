import scala.io.StdIn._

object Main extends App {

    val T = readLine()
    val m = readLine().toInt
    var userMap = Map.empty[String, String]
    val name = Array.ofDim[String](m)

    for (i <- 0 until m){
        val line = readLine().split(" ")
        name(i) = line(0)
        userMap = userMap + (line(0) -> line(1))
    }
    
    println(userMap(T))
}

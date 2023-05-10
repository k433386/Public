import scala.io.StdIn._

object Main extends App {

    val n = readLine().toInt
    var userMap = Map.empty[String, String]
    val name = Array.ofDim[String](n)

    for (i <- 0 until n){
        val line = readLine().split(" ")
        name(i) = line(0)
        userMap = userMap + (line(0) -> line(1))
    }
    
    for (i <- name){
        println(i + " " + userMap(i))
    }
}

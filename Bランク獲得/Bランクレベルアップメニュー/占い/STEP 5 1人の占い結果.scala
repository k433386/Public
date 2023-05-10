import scala.io.StdIn._

object Main extends App {

    val U = readLine()
    val n = readLine().toInt
    var bloodMap = Map.empty[String, String]
    var colorMap = Map.empty[String, String]

    for (i <- 0 until n){
        val line1 = readLine().split(" ")
        bloodMap = bloodMap + (line1(0) -> line1(1))
    }

    val m = readLine().toInt
    for (i <- 0 until m){
        val line2 = readLine().split(" ")
        colorMap = colorMap + (line2(0) -> line2(1))
    }
    
    println(colorMap(bloodMap(U)))
}

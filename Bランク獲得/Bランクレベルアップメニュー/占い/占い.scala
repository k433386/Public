import scala.io.StdIn._

object Main extends App {

    val n = readLine().toInt
    var bloodMap = Map.empty[String, String]
    var colorMap = Map.empty[String, String]
    val name = Array.ofDim[String](n)

    for (i <- 0 until n){
        val line1 = readLine().split(" ")
        name(i) = line1(0)
        bloodMap = bloodMap + (line1(0) -> line1(1))
    }

    val m = readLine().toInt
    for (i <- 0 until m){
        val line2 = readLine().split(" ")
        colorMap = colorMap + (line2(0) -> line2(1))
    }
    
    for (i <- name){
        println(i + " " + colorMap(bloodMap(i)))
    }

}

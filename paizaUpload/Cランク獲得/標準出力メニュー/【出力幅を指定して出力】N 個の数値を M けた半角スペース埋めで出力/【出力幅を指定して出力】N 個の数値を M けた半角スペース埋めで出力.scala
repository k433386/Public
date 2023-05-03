import scala.io.StdIn._

object Main extends App {

    val line = readLine().split(" ")
    val numN = line(0).toInt
    val numM = line(1).toInt
    
    for (j <- 0 until numN){
        val numA = readLine()
        var result = ""
        for (i <- 0 until numM-(numA.length.toInt)){
        result = result + " "
        }
        println(result + s"${numA}")
    }
}
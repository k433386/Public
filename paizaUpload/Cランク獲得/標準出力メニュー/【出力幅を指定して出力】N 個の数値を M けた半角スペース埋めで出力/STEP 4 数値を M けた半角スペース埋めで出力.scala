import scala.io.StdIn._

object Main extends App {

    val line = readLine().split(" ")
    val numN = line(0)
    val numM = line(1).toInt
    var result = ""
    
    for (i <- 0 until numM-(numN.length.toInt)){
        result = result + " "
    }
    println(result + s"${numN}")
}
import scala.io.StdIn._

object Main extends App {
    
    val line = readLine().split(" ")
    val numN = line(0).toInt
    val numA = line(1)
    val numB = line(2)
    var result = ""

    for (i <- 0 until numN){
        result = result + s"(${numA}, ${numB})"
        if (i < numN-1){
            result = result + ", "
        }
    }
    println(result)
}

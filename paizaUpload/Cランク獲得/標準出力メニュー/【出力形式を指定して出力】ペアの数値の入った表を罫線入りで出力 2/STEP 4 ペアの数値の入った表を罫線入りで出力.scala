import scala.io.StdIn._

object Main extends App {

    val line = readLine().split(" ")
    val row  = line(0).toInt
    val column = line(1).toInt
    val numA = line(2)
    val numB = line(3)

    for (i <- 0 until row){
        var result = ""
        for (j <- 0 until column){
            result = result + s"(${numA}, ${numB})"
            if (j < column-1){
                result = result + " | "
            }
        }
        println(result)
        val tmp = result.length.toInt
        result = ""
        for (k <- 0 until tmp){
            result = result + "="
        }
        if (i < row-1){
            println(result)
        }
    }
}

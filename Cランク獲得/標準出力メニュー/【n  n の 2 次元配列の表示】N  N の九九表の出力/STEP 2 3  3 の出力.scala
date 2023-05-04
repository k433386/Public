import scala.io.StdIn._

object Main extends App {

    val line = readLine().split(" ")
    val row = 3
    val column = 3

    for (i <- 0 until row){
        var result = ""
        for (j <- 0 until column){
            result = result + s"${line(i*column+j)}"
            if (j < column-1){
                result = result + " "
            }
        }
        println(result)
    }
}

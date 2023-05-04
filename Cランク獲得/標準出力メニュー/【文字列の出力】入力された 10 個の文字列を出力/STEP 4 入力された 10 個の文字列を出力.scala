import scala.io.StdIn._

object Main extends App {

    var result = ""

    for (i <- 0 until 10){
        val line = readLine()
        result = s"${result}" + s"${line}"
        if (i < 9){
            result = s"${result}" + " "
        }
    }
    println(result)
}
import scala.io.StdIn._

object Main extends App {
    val num = readLine().toInt

    for (i <- 0 until num){
        val line = readLine().split(" ")
        var result = ""

        for (j <- 0 until line(0).toInt){
            result = s"${result}" + s"${line(j+1)}"
            if (j+1 < line(0).toInt){
                result = s"${result}" + " "
            }
        }
        println(result)
    }
}
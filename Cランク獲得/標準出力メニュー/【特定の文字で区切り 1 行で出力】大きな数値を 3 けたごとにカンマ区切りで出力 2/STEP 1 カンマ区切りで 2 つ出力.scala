import scala.io.StdIn._

object Main extends App {

    val line = readLine().split(" ")
    var result = ""

    for (i <- 0 until 2){
        result = s"${result}" + s"${line(i)}"
        if (i < 1){
            result = s"${result}" + ","
        }
    }
    println(result)
}

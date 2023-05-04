import scala.io.StdIn._

object Main extends App {

    val key = 3
    var result = ""

    for (i <- 0 until key){
        val line = readLine()
        result = result + line
        if (i < key-1){
            result = result + "|"
        }
    }
    println(result)
}

import scala.io.StdIn._

object Main extends App {

    val line = readLine().split(" ")
    val key = 10
    var result = ""

    for (i <- 0 until key){
        result = result + s"${line(i)}"
        if (i < key-1){
            result = s"${result}" + ","
        }
    }
    println(result)
}

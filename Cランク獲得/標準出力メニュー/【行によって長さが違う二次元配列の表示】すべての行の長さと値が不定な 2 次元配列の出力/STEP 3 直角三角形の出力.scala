import scala.io.StdIn._

object Main extends App {

    val num = readLine().toInt
    var result = ""

    for (j <- 0 until num){
        for (i <- 0 until j+1){
            result = result + s"${i+1}"
            if (i < j){
                result = result + " "
            }
        }
        println(result)
        result = ""
    }
}
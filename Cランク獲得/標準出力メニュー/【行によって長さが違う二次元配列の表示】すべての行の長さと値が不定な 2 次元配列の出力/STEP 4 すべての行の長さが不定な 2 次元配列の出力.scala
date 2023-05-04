import scala.io.StdIn._

object Main extends App {

    val num = readLine().toInt
    val line = readLine().split(" ")
    var result = ""

    for (j <- 0 until num){
        for (i <- 0 until line(j).toInt){
            result = result + s"${i+1}"
            if (i < line(j).toInt-1){
                result = result + " "
            }
        }
        println(result)
        result = ""
    }
}
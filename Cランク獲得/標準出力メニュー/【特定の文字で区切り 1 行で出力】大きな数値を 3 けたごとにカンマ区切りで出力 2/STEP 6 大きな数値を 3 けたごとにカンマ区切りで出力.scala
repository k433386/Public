import scala.io.StdIn._

object Main extends App {

    val line = readLine()
    var result = ""

    for (i <- 0 until line.length){
        result = result + line(i)
        if (i < line.length-1 && (i+1)%3==0){
            result = result + ","
        }
    }
    println(result)
}

import scala.io.StdIn._

object Main extends App {

    val num = readLine().toInt
    val row = num
    val column = num

    for (i <- 0 until row){
        var result = ""
        for (j <- 0 until column){
            result = result + s"${(i+1)*(j+1)}"
            if (j < column-1){
                result = result + " "
            }
        }
        println(result)
    }
}

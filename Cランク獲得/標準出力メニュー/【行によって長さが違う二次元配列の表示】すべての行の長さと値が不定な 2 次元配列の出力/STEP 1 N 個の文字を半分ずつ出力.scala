import scala.io.StdIn._

object Main extends App {

    val num = readLine().toInt
    var result = ""

    for (i <- 0 until num/2){
        result = result + s"${i+1}"
        if (i < num/2 -1){
            result = result + " "
        }
    }
    println(result)
    result = ""
    for (i <- num/2 until num){
        result = result + s"${i+1}"
        if (i < num -1){
            result = result + " "
        }
    }
    println(result)  
}

import scala.io.StdIn._

object Main extends App {

    val line = readLine().split(" ")
    var numN = line(0).toInt
    val numM = line(1).toInt
    var result = ""

    while (numN >= numM){
        result = result + s"${numN%numM}" 
        numN = numN / numM
    }
    result = result + s"${numN}" 
    println(result.reverse)
}

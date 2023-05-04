import scala.io.StdIn._

object Main extends App {

    val line = readLine().split(" ")
    val numN = line(0).toInt
    val numM = line(1).toInt
    var result = ""

    for (i <- 0 until numN){
        result = result + s"${i+1}"
        if (i < numN -1){
            result = result + " "
        }
    }
    println(result)
    result = ""
    for (i <- 0 until numM){
        result = result + s"${i+1}"
        if (i < numM -1){
            result = result + " "
        }
    }
    println(result)
}

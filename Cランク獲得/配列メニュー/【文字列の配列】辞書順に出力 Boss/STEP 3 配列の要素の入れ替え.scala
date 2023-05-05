import scala.io.StdIn._

object Main extends App {

    val line = readLine().split(" ")
    val numA = line(0).toInt
    val numB = line(1).toInt
    val numN = line(2).toInt
    var lineA = readLine().split(" ")
    var tmp = ""

    tmp = lineA(numA-1)
    lineA(numA-1) = lineA(numB-1)
    lineA(numB-1) = tmp

    for (i <- 0 until numN){
        println(lineA(i))
    }
}

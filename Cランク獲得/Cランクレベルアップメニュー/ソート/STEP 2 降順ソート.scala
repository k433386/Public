import scala.io.StdIn._

object Main extends App {

    val num = readLine().split(" ")
    var numX = num(0).toInt
    var numY = num(1).toInt
    var tmp = 0

    tmp = numX
    numX = numY
    numY = tmp

    println(s"${numX} ${numY}")    
}
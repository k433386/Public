import scala.io.StdIn._
import Math._

object Main extends App {

    val num = readLine().split(" ")
    val numA = num(0).toInt
    val numB = num(1).toInt
    var numN = 10000

    numN = (numN / numA).round
    numN = numN % numB
    println(numN)  
}
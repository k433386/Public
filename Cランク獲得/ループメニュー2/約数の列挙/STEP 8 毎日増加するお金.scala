import scala.io.StdIn._
import math._

object Main extends App {

    val line = readLine().split(" ")
    var numA = line(0).toDouble
    val numB = line(1).toInt
    var count = 0

    while(numA <= numB){
        numA = (numA*1.1).floor
        count = count + 1
    }
    println(count)
}

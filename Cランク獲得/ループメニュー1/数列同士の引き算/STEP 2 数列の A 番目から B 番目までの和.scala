import scala.io.StdIn._

object Main extends App {

    val line1 = readLine().split(" ")
    val num = line1(0).toInt
    val numA = line1(1).toInt
    val numB = line1(2).toInt 
    val line2 = readLine().split(" ")
    var result = 0

    for (i <- numA to numB){
        result = result + line2(i-1).toInt
    }
    println(result)
}

import scala.io.StdIn._

object Main extends App {

    val num = readLine().toInt
    var Aline = Array.ofDim[Int](num)

    for (i <- 0 until num){
        val Anum = readLine().toInt
        Aline(i) = Anum
    }
    
    val numXY = readLine().split(" ")
    val numX = numXY(0).toInt
    val numY = numXY(1).toInt
    var tmp = 0

    tmp = Aline(numX-1)
    Aline(numX-1) = Aline(numY-1)
    Aline(numY-1) = tmp

    for (i <- Aline){
        println(i)
    }
}
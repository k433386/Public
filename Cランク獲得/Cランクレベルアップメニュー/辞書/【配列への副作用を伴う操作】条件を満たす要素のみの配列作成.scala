import scala.io.StdIn._

object Main extends App {

    val num = readLine().split(" ")
    val numN = num(0).toInt
    val numK = num(1).toInt
    var Aline = Array.ofDim[Int](numN)

    for (i <- 0 until numN){
        val Anum = readLine().toInt
        Aline(i) = Anum
    }

    val Bline = Aline.filter(_ >= numK)
    
    for (i <- Bline){
        println(i)
    }
}
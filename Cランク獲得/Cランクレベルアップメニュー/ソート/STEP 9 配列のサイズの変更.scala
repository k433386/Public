import scala.io.StdIn._

object Main extends App {

    val num = readLine().split(" ")
    val numN = num(0).toInt
    val numn = num(1).toInt
    var Aline = Array.ofDim[Int](numN)

    for (i <- 0 until numN){
        val Anum = readLine().toInt
        Aline(i) = Anum
    }

    var Bline = Array.ofDim[Int](numn)
    
    for (i <- 0 until numn){
        if (i < numN){
            Bline(i) = Aline(i)
        }
    }
    for (i <- Bline){
        println(i)
    }
}
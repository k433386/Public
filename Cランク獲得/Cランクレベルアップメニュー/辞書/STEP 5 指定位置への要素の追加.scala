import scala.io.StdIn._

object Main extends App {

    val num = readLine().toInt
    var Aline = Array.ofDim[Int](num)

    for (i <- 0 until num){
        val Anum = readLine().toInt
        Aline(i) = Anum
    }
    
    val numnB = readLine().split(" ")
    val numn = numnB(0).toInt
    val numB = numnB(1).toInt
    Aline = Aline.take(numn) ++ Array(numB) ++ Aline.drop(numn)

    for (i <- Aline){
        println(i)
    }
}
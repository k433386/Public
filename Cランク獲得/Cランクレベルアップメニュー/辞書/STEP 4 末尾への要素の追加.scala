import scala.io.StdIn._

object Main extends App {

    val num = readLine().toInt
    var Aline = Array.ofDim[Int](num)

    for (i <- 0 until num){
        val Anum = readLine().toInt
        Aline(i) = Anum
    }
    
    val numB = readLine().toInt
    Aline = Aline ++ Array(numB)

    for (i <- Aline){
        println(i)
    }
}
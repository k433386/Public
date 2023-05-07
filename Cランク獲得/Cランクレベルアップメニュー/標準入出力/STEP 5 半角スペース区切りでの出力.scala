import scala.io.StdIn._

object Main extends App {

    val num = readLine().split(" ")
    val N = num(0).toInt
    val K = num(1).toInt
    val F = num(2).toInt
    var Aline = Array.ofDim[Int](K)

    for (i <- 0 until K){
        Aline(i) = readLine().toInt
    }

    Aline = Aline.drop(F).distinct

    for (i <- Aline){
        println(i)
    }
}
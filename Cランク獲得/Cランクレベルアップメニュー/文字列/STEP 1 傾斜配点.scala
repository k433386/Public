import scala.io.StdIn._

object Main extends App {

    val num = readLine().toInt
    val Mline = readLine().split(" ").map(_.toInt)
    var Aline = Array.ofDim[Int](num, 5)
    var Rline = Array.ofDim[Int](num)

    for (i <- 0 until num){
        val Anum = readLine().split(" ").map(_.toInt)
        Aline(i) = Anum
    }

    for (i <- 0 until num){
        var sum = 0
        for (j <- 0 until 5){
            sum = sum + Mline(j) * Aline(i)(j)
        }
        Rline(i) = sum
    }

    println(Rline.max)
}
import scala.io.StdIn._

object Main extends App {

    val num = readLine().toInt
    var Aline = Array.ofDim[Int](num)

    for (i <- 0 until num){
        val Anum = readLine().toInt
        Aline(i) = Anum
    }

    for (i <- 1 until num){
        for (j <- 0 until num){
            if (i > j){
                println(Aline(i)*Aline(j))
            }
        }
    }
}
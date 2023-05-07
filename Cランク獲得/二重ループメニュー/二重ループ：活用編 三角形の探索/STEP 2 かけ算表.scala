import scala.io.StdIn._

object Main extends App {

    val N = readLine().toInt
    val Aline = readLine().split(" ").map(_.toInt)
    var Bline = Array.ofDim[Int](N, N)

    for (i <-0 until N){
        for (j <-0 until N){
            Bline(i)(j) = Aline(i)*Aline(j)
        }
    }

    for(i <- Bline){
        println(i.mkString(" "))
    }
}
import scala.io.StdIn._

object Main extends App {
     
    val NXP = readLine().split(" ").map(_.toInt)
    val N = NXP(0)
    val X = NXP(1)
    val P = NXP(2)
    val An = Array.ofDim[Int](N+2)

    An(0) = P
    for (i <- 1 until N+1){
        An(i) = readLine().toInt
    }
    An(N+1) = X

    println(An.sorted.indexOf(P)+1)
}

import scala.io.StdIn._

object Main extends App {

    val Array(n, m, k) = readLine().split(" ").map(_.toInt)
    val anm = Array.ofDim[Int](n, m)

    for (i <- 0 until n){
        anm(i) = readLine().split(" ").map(_.toInt)
    }

    def maxValue() = {
        var max = 0
        for (i <- 0 until n-k+1; j <- 0 until m-k+1){
            var sum = 0
            for (y <- 0 until k; x <- 0 until k){
                sum = sum + anm(i+y)(j+x)
            }
            max = Array(max, sum).max
        }
        println(max)
    }
    maxValue()
}

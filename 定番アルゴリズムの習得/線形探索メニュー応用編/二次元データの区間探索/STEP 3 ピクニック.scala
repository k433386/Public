import scala.io.StdIn._

object Main extends App {

    val Array(n, m) = readLine().split(" ").map(_.toInt)
    val anm = Array.ofDim[Int](n, m)

    for (i <- 0 until n){
        anm(i) = readLine().split(" ").map(_.toInt)
    }

    def countUp() = {
        var count = 0
        for (i <- 0 until n-1; j <- 0 until m-1){
            if (anm(i)(j)==anm(i)(j+1) && anm(i)(j)==anm(i+1)(j) && anm(i)(j)==anm(i+1)(j+1)){
                count = count + 1
            }
        }
        println(count)
    }
    countUp()
}

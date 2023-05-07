import scala.io.StdIn._

object Main extends App {

    val num = readLine().split(" ")
    val N = num(0).toInt
    val K = num(1).toInt
    val M = num(2).toInt
    var Aline = Array.ofDim[Int](N)
    var count = - M

    for (i <- 0 until N){
        Aline(i) = readLine().toInt
    }

    for (i <- Aline){
        if (i >= K){
            count = count + 1
        }
    }
    if (count < 0){
        count = 0
    }
    println(count)
}
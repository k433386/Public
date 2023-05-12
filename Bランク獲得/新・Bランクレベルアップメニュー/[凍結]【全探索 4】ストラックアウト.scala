import scala.io.StdIn._
import math._

object Main extends App {

    var S : Array[Int] = Array.empty
    var now = Array.fill(11)(0)
    val b = Array.ofDim[Int](9, 5)
    val strategies = Array(1, 2, 3, 4, 5, 6, 7, 8, 9).permutations
    var stratPoint : Array[Int] = Array.empty

    S = S ++ Array(0)
    for (i <- 0 until 3){
        S = S ++ readLine().split(" ").map(_.toInt)
    }
    for (i <- 0 until 9){
        b(i) = Array(0) ++ readLine().split(" ").map(_.toInt)
    }





    for (strategy <- strategies){
        var point = 0
        for (i <- strategy){
            now(i) = 1
            point = point + S(i)
        }
        stratPoint = stratPoint ++ Array(point)
    }

    println(stratPoint.max)
}
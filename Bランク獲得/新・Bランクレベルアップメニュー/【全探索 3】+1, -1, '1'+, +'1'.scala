import scala.io.StdIn._
import math._

object Main extends App {

    val N = readLine().toInt
    val X = Array.ofDim[Int](N)
    var all : Array[Int] = Array.empty

    for (i <- 0 until N){
        X(i) = readLine().toInt
    }
    
    val pair = X.combinations(2)
    for (j <- pair){
        all = all ++ Array(operation(j(0), j(1)))
    }

    def operation(x: Int, y: Int) : Int = {

        def plus(num: Int) : Int = {
            return num + 1
        }
        def minus(num: Int) : Int = {
            return num - 1
        }
        def head(num: Int) : Int = {
            return pow(10, num.toString.length).toInt + num
        }
        def tail(num: Int) : Int = {
            return 10*num + 1
        }
        def none(num: Int) : Int = {
            return num
        }

        var XY : Array[Int] = Array.empty
        val rx = Array(plus(x), minus(x), head(x), tail(x), none(x))
        val ry = Array(plus(y), minus(y), head(y), tail(y), none(y))
        
        for (i <- rx; j <- ry){
            XY = XY ++ Array(abs(i - j))
        }
        return XY.min
    }
    println(all.min)
}
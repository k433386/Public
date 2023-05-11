import scala.io.StdIn._

object Main extends App {

    val X = readLine().toInt
    val F = readLine().split(" ")
    val F1 = F(0).toInt
    val F2 = F(1).toInt
    val LN = readLine().split(" ")
    val L = LN(0).toInt
    val N = LN(1).toInt
    val sline = readLine().split(" ").map(_.toInt)

    var nowP = 0
    var FUEL : Array[Int] = Array.empty

    for (dis <- sline){
        val dest = dis - nowP
        if (dest <= X){
            FUEL = FUEL ++ Array(dest * F1)
        } else {
            FUEL = FUEL ++ Array(X * F1)
            FUEL = FUEL ++ Array((dest-X) * F2)            
        }
        nowP = dis
    }
    if (L-nowP <= X){
        FUEL = FUEL ++ Array((L-nowP) * F1)
    } else {
        FUEL = FUEL ++ Array(X * F1)
        FUEL = FUEL ++ Array((L-nowP-X) * F2)
    }

    println(FUEL.sum)
}

/*
import scala.io.StdIn._

object Main extends App {

    val X = readLine().toLong
    val F = readLine().split(" ").map(_.toLong)
    val F1 = F(0)
    val F2 = F(1)
    val LN = readLine().split(" ").map(_.toLong)
    val L = LN(0)
    val N = LN(1)
    val sline = readLine().split(" ").map(_.toLong)

    var nowP = 0L
    var FUEL = 0L

    for (dis <- sline){
        val dest = dis - nowP
        if (dest <= X){
            FUEL = FUEL + dest * F1
        } else {
            FUEL = FUEL + X * F1
            FUEL = FUEL + (dest-X) * F2            
        }
        nowP = dis
    }
    if (L-nowP <= X){
        FUEL = FUEL + (L-nowP) * F1
    } else {
        FUEL = FUEL + X * F1
        FUEL = FUEL + (L-nowP-X) * F2
    }

    println(FUEL)
}

*/
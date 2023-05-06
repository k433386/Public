import scala.io.StdIn._

object Main extends App {

    val line = readLine().split(" ")
    val H = line(0).toInt
    val W = line(1).toInt
    val r = line(2).toInt
    val c = line(3).toInt
    var Smaze = Array.ofDim[String](H, W)

    for (i <- 0 until H){
        val tmp = readLine()
        for (j <- 0 until W){
            Smaze(i)(j) = tmp(j).toString
        }
    }
    
    if (Smaze(r-1)(c-1) == "#") {
        println("Yes")
    } else {
        println("No")
    }
}

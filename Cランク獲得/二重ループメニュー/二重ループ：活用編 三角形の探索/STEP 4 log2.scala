import scala.io.StdIn._
import math._

object Main extends App {

    val N = readLine().toInt
    var Nx = 1
    var count = 0

    while (pow(2, Nx) <= N){
        val tmp = (N / pow(2, Nx)).toInt
        count = count + tmp
        Nx = Nx + 1
    }
    println(count)
}
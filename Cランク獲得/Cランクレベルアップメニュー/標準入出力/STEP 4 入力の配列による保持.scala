import scala.io.StdIn._

object Main extends App {

    val N = readLine().toInt
    var Aline : Array[Int] = Array.empty

    for (i <- 0 until N){
        Aline = Aline ++ Array(readLine().toInt)
    }
    println(Aline.max)
}
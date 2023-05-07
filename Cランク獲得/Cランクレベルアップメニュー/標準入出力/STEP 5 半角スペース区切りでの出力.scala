import scala.io.StdIn._

object Main extends App {

    val N = readLine().toInt
    var Aline : Array[String] = Array.empty

    for (i <- 0 until N){
        Aline = Aline ++ Array("paiza")
    }
    println(Aline.mkString(" "))
}
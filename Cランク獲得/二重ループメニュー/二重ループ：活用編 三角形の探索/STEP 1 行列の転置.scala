import scala.io.StdIn._

object Main extends App {

    val Array(n, k) = readLine().split(" ").map(_.toInt)
    var a = Array.fill(n)(readLine().split(" ").map(_.toInt))
    val transposedMatrix = a.transpose

    for(i <- transposedMatrix){
        println(i.mkString(" "))
    }
}
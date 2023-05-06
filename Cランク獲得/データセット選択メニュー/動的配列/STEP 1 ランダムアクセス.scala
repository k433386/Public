import scala.io.StdIn._

object Main extends App {

    val num = readLine().split(" ")
    val N = num(0).toInt    
    val M = num(1).toInt    
    var Aline = readLine().split(" ").map(_.toInt)

    println(Aline(M-1))
}

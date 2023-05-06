import scala.io.StdIn._

object Main extends App {

    val N = readLine().toInt
    var Aline = readLine().split(" ").map(_.toInt)
    val Q = readLine().toInt
    var Bline = readLine().split(" ").map(_.toInt)

    for (i <- 0 until Q){
        println(Aline(Bline(i)-1))
    }
}

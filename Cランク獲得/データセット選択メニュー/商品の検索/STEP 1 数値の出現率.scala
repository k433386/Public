import scala.io.StdIn._

object Main extends App {

    val N = readLine().toInt
    val Aline = readLine().split(" ").map(_.toInt)
    var result = Array.ofDim[Int](10)

    for (i <- 0 until 10){
        result(i) = Aline.count(x => x == i)
    }
    println(result.mkString(" "))
}

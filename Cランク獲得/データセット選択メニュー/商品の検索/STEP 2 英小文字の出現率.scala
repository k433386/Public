import scala.io.StdIn._

object Main extends App {

    val N = readLine().toInt
    val S = readLine()
    var result : Array[Int] = Array.empty

    for (i <- 'a' to 'z'){
        result = result ++ Array(S.count(x => x == i))
    }
    println(result.mkString(" "))
}

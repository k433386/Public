import scala.io.StdIn._

object Main extends App {

    val n = readLine().toInt
    val key = Array.ofDim[Int](n)
    var SD = Map.empty[Int, String]

    for (i <- 0 until n){
        val line = readLine.split(" ")
        SD = SD + (line(1).toInt -> line(0))
        key(i) = line(1).toInt
    }

    val result = key.sorted
    for (i <- result){
        println(SD(i))
    }
}

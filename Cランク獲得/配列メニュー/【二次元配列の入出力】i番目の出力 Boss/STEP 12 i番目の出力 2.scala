import scala.io.StdIn._

object Main extends App {

    val line = readLine().split(" ")
    val numK = line(0).toInt
    val numL = line(1).toInt
    var Dline = Array.ofDim[String](3, 3)

    for (i <- 0 until 3){
        val line = readLine().split(" ")
        Dline(i) = line
    }
    println(Dline(numK-1)(numL-1))
}

//https://b0npu.hatenablog.com/entry/2016/09/24/202330
//https://www.ne.jp/asahi/hishidama/home/tech/scala/array.html
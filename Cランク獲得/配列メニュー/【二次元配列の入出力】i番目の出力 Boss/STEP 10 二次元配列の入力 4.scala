import scala.io.StdIn._

object Main extends App {

    val line = readLine().split(" ")
    val numN = line(0).toInt
    val numM = line(1).toInt
    var Dline = Array.ofDim[String](numN, numM)

    for (i <- 0 until numN){
        val line = readLine().split(" ")
        Dline(i) = line
    }
    for (i <- 0 until Dline.length){
        println(Dline(i).mkString(" "))
    }
}

//https://b0npu.hatenablog.com/entry/2016/09/24/202330
//https://www.ne.jp/asahi/hishidama/home/tech/scala/array.html

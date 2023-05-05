import scala.io.StdIn._

object Main extends App {

    val num = readLine().toInt
    var Dline = Array.ofDim[String](num, 5)

    for (i <- 0 until num){
        val line = readLine().split(" ")
        Dline(i) = line
    }
    for (i <- 0 until Dline.length){
        println(Dline(i).mkString(" "))
    }
}

//https://b0npu.hatenablog.com/entry/2016/09/24/202330
//https://www.ne.jp/asahi/hishidama/home/tech/scala/array.html

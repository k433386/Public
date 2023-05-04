import scala.io.StdIn._

object Main extends App {

    val num = readLine().toInt
    val lineA = readLine.split(" ")
    var tmp = 0

    for (i <- 0 until num){
        if (lineA(i).toInt > tmp){
            tmp = lineA(i).toInt
        }
    }
    println(tmp)
}

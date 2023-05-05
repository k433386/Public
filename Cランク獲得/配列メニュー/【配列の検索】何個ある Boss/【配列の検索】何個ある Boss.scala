import scala.io.StdIn._

object Main extends App {

    val line = readLine().split(" ")
    val numN = line(0).toInt
    val numM = line(1).toInt
    val lineA = readLine().split(" ")
    var count = 0

    for (i <- 0 until numM){
        if (lineA(i).toInt == numN){
            count = count + 1
        }
    }
    println(count)
}

import scala.io.StdIn._

object Main extends App {

    val num = readLine().toInt
    val lineA = readLine.split(" ")
    var count = 0

    for (i <- 0 until num){
        if (lineA(i).toInt != 1){
            count = count + 1
        } else {
           println(count+1) 
        }
    }
}

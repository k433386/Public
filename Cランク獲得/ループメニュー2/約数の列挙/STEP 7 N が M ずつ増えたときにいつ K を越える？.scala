import scala.io.StdIn._

object Main extends App {

    val line = readLine().split(" ")
    var numN = line(0).toInt
    val numM = line(1).toInt
    val numK = line(2).toInt
    var count = 0

    while(numN <= numK){
        numN = numN + numM
        count = count + 1
    }
    println(count)
}

import scala.io.StdIn._

object Main extends App {

    val line = readLine().split(" ")
    var numN = line(0).toInt
    val numM = line(1).toInt
    var count = 0

    while (numN % numM == 0){
        count = count + 1
        numN = numN / numM
    }
    println(count)
}

import scala.io.StdIn._

object Main extends App {

    val num = readLine().split(" ")
    val numN = num(0).toInt
    val numM = num(1).toInt

    val lineA = readLine().split(" ")
    val lineB = readLine().split(" ")
    
    var result = ""
    var tmp = 0

    for (j <- 0 until numM){
        for (i <- 0 until lineB(j).toInt){
            result = result + s"${lineA(tmp+i)}"
            if (i < lineB(j).toInt-1){
                result = result + " "
            } else {
                tmp = tmp + lineB(j).toInt
            }
        }
        println(result)
        result = ""
    }
}
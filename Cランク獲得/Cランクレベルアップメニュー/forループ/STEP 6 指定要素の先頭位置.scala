import scala.io.StdIn._

object Main extends App {

    val num = readLine.split(" ")
    val numN = num(0).toInt
    val numK = num(1).toInt
    var tmp = 0
    var flag = 0

    for (i <- 0 until numN){
        val Anum = readLine().toInt
        if (Anum == numK && flag == 0){
            tmp = i + 1
            flag = 1
        }
    }
    if (flag == 0){
        println(-1)
    } else if (flag == 1){
        println(tmp)
    }
}
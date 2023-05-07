import scala.io.StdIn._

object Main extends App {

    val line710 = readLine().reverse
    val line46 = readLine().reverse
    val line23 = readLine().reverse
    val line1 = readLine()

    val Allline = (s"${line1} ${line23} ${line46} ${line710}").split(" ").map(_.toInt)
    var count = 0
    var flag = 0

    for (i <- 0 until 10){
        if (Allline(i) == 1){
            if  (flag == 0){
                println(i+1)
                flag = 1
            }
            count = count + 1
        }
    }
    println(count)
}
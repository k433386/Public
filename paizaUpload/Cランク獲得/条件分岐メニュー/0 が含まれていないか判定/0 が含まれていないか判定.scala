import scala.io.StdIn._

object Main extends App {

    val num = readLine().toInt
    var flag = "YES"

    for (i <- 0 until num){
        val numA = readLine()
        if (flag == "NO") {
            flag = "NO"
        } else if (numA == "0" || numA == "0 " && flag == "YES"){
            flag = "NO"
        } else {
            flag = "YES"
        }
    }
    if (flag == "NO"){
        println(flag)
    } else {
        println(flag)  
    }
}
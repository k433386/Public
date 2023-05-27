import scala.io.StdIn._

object Main extends App {

    val n = readLine().toInt
    val a = readLine().split(" ").map(_.toInt)
    var level = 1
    var flag = true

    for (i <- a.sorted){
        if (i <= level){
            level = i + 1
        } else {
            flag = false
        }
    }
    if (flag) {
        println("Yes")
    } else {
        println("No")
    }
}
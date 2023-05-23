import scala.io.StdIn._

object Main extends App {

    val Array(n) = readLine().split(" ").map(_.toInt)

    for (_ <- 0 until n) {
        val x = readLine().split("")
        var tmp = 0

        for ((i, j) <- ('a' to 'z').zip(1 to 26)){
            tmp = tmp + x.count(_ == i.toString) * x.indexOf(i.toString) * j  
        }
        println(tmp % 100)
    }
}
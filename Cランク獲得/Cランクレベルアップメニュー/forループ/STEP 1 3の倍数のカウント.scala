import scala.io.StdIn._

object Main extends App {

    val n = readLine().toInt
    var Aline = readLine().split(" ").map(_.toInt)
    var count = 0

    for (i <- Aline){
        if (i%3 == 0){
            count = count + 1
        }  
    }
    println(count)
}

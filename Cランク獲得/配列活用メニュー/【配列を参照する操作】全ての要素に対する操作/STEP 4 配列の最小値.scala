import scala.io.StdIn._

object Main extends App {

    val num = readLine().toInt
    var tmp = 1000

    for (i <- 0 until num){
        val Anum = readLine().toInt
        if (Anum < tmp){
            tmp = Anum
        }
    }
    println(tmp)
}
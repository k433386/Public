import scala.io.StdIn._

object Main extends App {

    val line = readLine().split(" ")
    val N = line(0).toInt
    val K = line(1).toInt
    var tmp = -10000
    
    val Aline = readLine().split(" ").map(_.toInt)
    val Bline = readLine().split(" ").map(_.toInt)

    for (i <- Aline){
        for (j <- Bline){
            if (i*j > tmp){
                tmp = i*j
            }
        }
    }
    println(tmp)
}
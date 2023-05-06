import scala.io.StdIn._

object Main extends App {

    val line = readLine().split(" ")
    val N = line(0).toInt
    val M = line(1).toInt
    var Aname : Array[String] = Array.empty
    var Aprice : Array[Int] = Array.empty
    var Sarray : Array[String] = Array.empty

    for (i <-0 until N){
        val AB = readLine().split(" ")
        Aname = Aname ++ Array(AB(0))
        Aprice = Aprice ++ Array(AB(1).toInt)
    }
    for (i <-0 until M){
        Sarray = Sarray ++ Array(readLine())
    }

    for (i <- Sarray){
        if (Aname.contains(i)){
            println(Aprice(Aname.indexOf(i)))
        } else {
            println(-1)
        }
    }
}

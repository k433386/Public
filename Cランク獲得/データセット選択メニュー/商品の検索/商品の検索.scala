import scala.io.StdIn._

object Main extends App {

    val line = readLine().split(" ")
    val N = line(0).toInt
    val Q = line(1).toInt
    var Sarray : Array[String] = Array.empty
    var Tarray : Array[String] = Array.empty

    for (i <-0 until N){
        Sarray = Sarray ++ Array(readLine())
    }
    for (i <-0 until Q){
        Tarray = Tarray ++ Array(readLine())
    }

    for (i <- Tarray){
        if (Sarray.contains(i)){
            println(Sarray.indexOf(i)+1)
        } else {
            println(-1)
        }
    }
}

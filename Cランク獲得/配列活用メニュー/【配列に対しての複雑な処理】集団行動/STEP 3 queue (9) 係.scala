import scala.io.StdIn._

object Main extends App {

    val N = readLine().toInt
    var Sline = Array.ofDim[String](N)
    var Aline : Array[Any] = Array.empty

    for (i <- 0 until N){
        Sline(i) = readLine()
    }

    for (i <- 0 until N){
        if (Sline(i).length == 3 && Aline != Array.empty){
            Aline = Aline.drop(1)

        } else if (Sline(i).length != 3){
            val tmp = Sline(i).split(" ")
            Aline = Aline ++ Array(tmp(1).toInt) 
        }
    }
    for (i <- Aline){
        println(i)
    }
}
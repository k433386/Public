import scala.io.StdIn._

object Main extends App {
     
    val NK = readLine().split(" ").map(_.toInt)
    val N = NK(0)
    val K = NK(1)
    var numID : Map[Int, String] = Map.empty
    val Sk = Array.ofDim[String](K)

    for (i <- 0 until N){
        val data = readLine().split(" ")
        numID = numID ++ Map(data(0).toInt -> data(1))
    }
    for (i <- 0 until K){
        val op = readLine().split(" ")
        if (op(0) == "join"){
            numID = numID ++ Map(op(1).toInt -> op(2))
        } else if (op(0) == "leave"){
            numID = numID - op(1).toInt
        } else if (op(0) == "call"){
            println(numID(op(1).toInt))
        }
    }
}

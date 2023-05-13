import scala.io.StdIn._

object Main extends App {
     
    val NK = readLine().split(" ").map(_.toInt)
    val N = NK(0)
    val K = NK(1)
    var numID : Map[Int, String] = Map.empty
    val Qk = Array.ofDim[Int](K)

    for (i <- 0 until N){
        val data = readLine().split(" ")
        numID = numID ++ Map(data(0).toInt -> data(1))
    }
    for (i <- 0 until K){
        Qk(i) = readLine().toInt
    }

    for (i <- Qk){
        println(numID(i))
    }
}

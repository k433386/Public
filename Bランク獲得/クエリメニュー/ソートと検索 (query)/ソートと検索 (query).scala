import scala.io.StdIn._

object Main extends App {
     
    val NKP = readLine().split(" ").map(_.toInt)
    val N = NKP(0)
    val K = NKP(1)
    val P = NKP(2)
    val An = Array.ofDim[Int](N)
    val Evek = Array.ofDim[String](K)
    var All : Array[Int] = Array.empty
 
    All = All ++ Array(P)
    for (i <- 0 until N){
        An(i) = readLine().toInt
    }
    All = All ++ An

    for (i <- 0 until K){
        Evek(i) = readLine()
    }

    for (i <- Evek){
        val data = i.split(" ")
        if (data(0) == "join"){
            All = All ++ Array(data(1).toInt)
        } else {
            All = All.sorted
            println(All.indexOf(P)+1)
        }
    }
}

import scala.io.StdIn._

object Main extends App {
     
    val NK = readLine().split(" ").map(_.toInt)
    val N = NK(0)
    val K = NK(1)
    val An = Array.ofDim[String](N)
    val Sk = Array.ofDim[String](K)
    var result: Array[String] = Array.empty

    for (i <- 0 until N){
        An(i) = readLine()
    }
    for (i <- 0 until K){
        Sk(i) = readLine()
    }

    result = An  
    for (i <- Sk){
        if (i == "pop"){
            result = result.drop(1)
        } else {
            for (j <- result){ println(j) }
        }
    }
}

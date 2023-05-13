import scala.io.StdIn._

object Main extends App {
     
    val NK = readLine().split(" ")
    val N = NK(0).toInt
    val K = NK(1).toInt
    val Sn = Array.ofDim[String](N)
    val YCk = Array.ofDim[String](K)

    def padding(x: String) : String = {
        val tmp = String.format("%10s", x).replace(" ", "0")
        return tmp
    }

    for (i <- 0 until N){
        Sn(i) = readLine()
    }
    for (i <- 0 until K){
        val line = readLine().split(" ")
        YCk(i) = (padding(line(0)) + line(1))
    }

    for (i <- YCk.sorted; j <- Sn){
        if (i.contains(j)){
            println(j)
        }
    }
}
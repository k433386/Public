import scala.io.StdIn._

object Main extends App {

    class basic(){

    }
    
    val NKS = readLine().split(" ")
    val N = NKS(0).toInt
    val K = NKS(1).toInt
    val S = NKS(2).toInt
    var arrMap = Map.empty[Int, Array[String]]
    var result = Array.ofDim[String](K+1)
    var pos = 0

    for(i <- 1 to N){
        arrMap = arrMap + (i -> readLine().split(" "))
    }

    for(i <- 0 to K){
        if (i == 0){
            pos = S
        } else {
            val M = readLine().toInt
            pos = arrMap(pos)(M).toInt
        }
        result(i) = arrMap(pos)(0)
    }

    println(result.mkString(""))
}

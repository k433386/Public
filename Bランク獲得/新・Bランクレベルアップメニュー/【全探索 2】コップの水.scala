import scala.io.StdIn._

object Main extends App {

    val NX = readLine().split(" ").map(_.toInt)
    val N = NX(0)
    val X = NX(1)
    val w = Array.ofDim[Int](N)
    var comb : Array[Int] = Array.empty

    for (i <- 0 until N){
        w(i) = readLine().toInt
    }
    
    for (i <- 1 to N){
        val tmp = w.combinations(i)
        for (j <- tmp){
            comb = comb ++ Array(j.sum)
        }
    }

    println(comb.filter(_ <= X).max)
}
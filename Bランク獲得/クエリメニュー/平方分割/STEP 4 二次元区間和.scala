import scala.io.StdIn._

object Main extends App {

    val HWN = readLine().split(" ").map(_.toInt)
    val H = HWN(0)
    val W = HWN(1)
    val N = HWN(2)
    val An = Array.ofDim[Int](H, W)
    val Sum = Array.ofDim[Int](H, W)

    for(i <- 0 until H){
        An(i) = readLine().split(" ").map(_.toInt)
    }

    for (i <- 0 until H; j <- 0 until W){
        Sum(i)(j) = An(i)(j)
        if (0 < i) {
            Sum(i)(j) = Sum(i)(j) + Sum(i-1)(j)
        }
        if (0 < j) {
            Sum(i)(j) = Sum(i)(j) + Sum(i)(j-1)
        }
        if (0 < i && 0 < j) {
            Sum(i)(j) = Sum(i)(j) - Sum(i-1)(j-1)
        }
    }

    for(i <- 0 until N){
        val abcd = readLine().split(" ").map(_.toInt)
        val a = abcd(0) -1 
        val b = abcd(1) -1 
        val c = abcd(2) -1 
        val d = abcd(3) -1
        var ans = 0

        ans = ans + Sum(c)(d)

        if (0 < a && 0 < b) {
            ans = ans + Sum(a-1)(b-1)
        }
        if (0 < a) {
            ans = ans - Sum(a-1)(d)
        }
        if (0 < b) {
            ans = ans - Sum(c)(b-1);
        }

        println(ans)
    }
}

//解答例使用済み
import scala.io.StdIn._

object Main extends App {
     
    val nxaybzc = readLine().split(" ").map(_.toInt)
    val n = nxaybzc(0)
    val x = nxaybzc(1)
    val a = nxaybzc(2)
    val y = nxaybzc(3)
    val b = nxaybzc(4)
    val z = nxaybzc(5)
    val c = nxaybzc(6)
    var dp = Array.fill[Int](n+z)(100000000)

    dp(0) = 0
    for (i <- x to n+z-1){
        if (i >= x){
            dp(i) = Array(dp(i), dp(i-x) + a).min
        }
        if (i >= y){
            dp(i) = Array(dp(i), dp(i-y) + b).min   
        }
        if (i >= z){
            dp(i) = Array(dp(i), dp(i-z) + c).min
        }
    }
    for (i <- 1 to n){
        val tmp = Array.ofDim[Int](z)
        for (j <- 0 until z){
            tmp(j) = dp(i+j)
        }
        dp(i) = tmp.min
    }
    println(dp(n))
}

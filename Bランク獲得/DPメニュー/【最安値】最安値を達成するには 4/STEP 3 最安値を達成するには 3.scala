import scala.io.StdIn._

object Main extends App {
     
    val nxayb = readLine().split(" ").map(_.toInt)
    val n = nxayb(0)
    val x = nxayb(1)
    val a = nxayb(2)
    val y = nxayb(3)
    val b = nxayb(4)
    var dp = Array.fill[Int](n+y)(100000000)

    dp(0) = 0
    for (i <- x to n+y-1){
        if (i >= x){
            dp(i) = Array(dp(i), dp(i-x) + a).min
        }
        if (i >= y){
            dp(i) = Array(dp(i), dp(i-y) + b).min   
        }

    }
    for (i <- 1 to n){
        val tmp = Array.ofDim[Int](y)
        for (j <- 0 until y){
            tmp(j) = dp(i+j)
        }
        dp(i) = tmp.min
    }
    println(dp(n))
}

import scala.io.StdIn._

object Main extends App {

    val line = readLine().split(" ").map(_.toInt)
    val N = line(0)
    val M = line(1)
    val An = readLine.split(" ").map(_.toInt)

    def loopMain(N: Int, M: Int, An: Array[Int]): Int = {
        var sum = An(0)
        var ans = N+1
        var l = 0
        var u = 0
        while (true) {
            if (M <= sum) {
                sum = sum - An(l)
                ans = Array(ans, u - l + 1).min
                l = l + 1
            } else {
                u = u + 1
                if (u == N) {
                    return ans
                } else {
                    sum = sum + An(u)
                }
            }
        }
        return ans        
    }
    
    val ans = loopMain(N, M, An)
    if (ans == N+1) {
        println(-1)
    } else {
        println(ans)
    }
}

//解答例使用済み
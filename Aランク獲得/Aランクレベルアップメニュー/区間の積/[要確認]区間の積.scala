import scala.io.StdIn._

object Main extends App {

    val line = readLine().split(" ").map(_.toInt)
    val N = line(0)
    val K = line(1)
    val An = readLine.split(" ").map(_.toLong)

    def loopMain(N: Int, M: Int, An: Array[Long]): Long = {
        var sum = An(0)
        var ans = 100000000000L
        var h = 1L
        var l = 0L
        var add = 1L
        while (true) {
            if (l == N){ return ans }
            else if (h == l){
                h = h + 1
            }
            else if (K <= sum) {
                sum = sum - An(l.toInt)
                ans = Array(ans, h-l).min
                sum = sum/An(l.toInt)
                l = l + 1
            } else {
                if (h == N) {
                    return ans
                } else if(An((h-1).toInt) == 0){
                    add = 1
                    l = h
                    while(l < N && An(l.toInt) == 0){
                        l = h + add
                        add = add + 1
                    }
                    if (l == N){ return ans }
                    h = l + 1
                    sum = An(l.toInt)
                } else {
                    sum = sum * An(h.toInt)
                    h = h + 1
                }
            }
        }
        return ans
    }
    
    val ans = loopMain(N, K, An)
    println(ans)
}

//解答例使用済み
import scala.io.StdIn._

object Main extends App {

    val Array(n, k) = readLine().split(" ").map(_.toLong)
    val numbers = readLine().split(" ").map(_.toLong)

    def whileMain(): Long = {
        var count = n+1
        var start = 0L
        var end = 0L
        var product = 1L
            
        while (end < n) {
            if (numbers(end.toInt) == 0) {
                start = end + 1
                end = start
                product = 1L
            } else {
                product = product * numbers(end.toInt)
                while (product >= k && start <= end) {
                    count = count.min(end - start + 1)
                    product = product / numbers(start.toInt)
                    start = start + 1
                }
                end = end + 1
            }
        }
        return count
    }
    println(whileMain())
}

//解答例使用済み
//テスト通過に誤差あり？
//.filter(_ != 0)
/*
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


*/
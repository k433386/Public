import scala.io.StdIn._

object Main extends App {

    def fiboCps(n: Int)(cont: BigInt => BigInt): BigInt = {
        @scala.annotation.tailrec
        def fiboHelper(n: Int, a: BigInt, b: BigInt): BigInt = {
            if (n <= 0) cont(a)
            else fiboHelper(n - 1, b, a + b)
        }
        fiboHelper(n, 0, 1)
    }

    val n = readLine().trim().toInt
    println(fib(n))
}

//メモ化最適はスタックオーバーフロー
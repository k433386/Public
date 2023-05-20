import scala.io.StdIn._

object Main extends App {

    def modPow(a: Long, b: Long, m: Long): Long = {
        var ans = 1L
        var A = a
        var B = b
        while (B > 0) {
            if ((B & 1) == 1) {
                ans = (ans * A) % m
            }
            A = (A * A) % m
            B >>= 1
        }
        return ans
    }
    def extGCD(a: Long, b: Long): (Long, Long, Long) = {
        if (b != 0){
            val (c, y, x) = extGCD(b, a%b)
            val tmp = y - (a/b) * x
            return (c, x, tmp)
        }
        return (a, 1, 0)
    }

    val Array(p, q, e, m) = readLine().split(" ").map(_.toLong)
    val n = p*q
    val np = (p-1)*(q-1)
    
    val (c, x, y) = extGCD(e, np)
    val d = (x+np) % np
    val E = modPow(m, e, n)
    val res = modPow(E, d, n)
    println(d)
    println(E)
    println(res)
}
//解答例使用済み
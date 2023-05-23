import scala.io.StdIn._

object Main extends App {

    val n = readLine().toInt
    val H = Array.fill(10)(-1)

    for (_ <- 0 until n) {
        val x = readLine().toInt
        var tmp = x % 10
        if (H(tmp) == -1){
            H(tmp) = x
        } else {
            var flag = true
            var i = 0
            while (flag){
                i = i + 1
                val retmp = (x+i) % 10
                if (H(retmp) == -1){
                    H(retmp) = x
                    flag = false
                }
            }
        }
    }
    for (i <- H){
        println(i)
    }
}
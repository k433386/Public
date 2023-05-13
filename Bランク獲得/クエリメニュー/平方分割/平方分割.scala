import scala.io.StdIn._

object Main extends App {

    val K = readLine().toInt
    val A = Array.ofDim[Int](100, 100)
    val B = Array.ofDim[Int](10000)
    val rangeMax = Array.ofDim[Int](100)
    var ans = 0

    for (i <- 0 until 100; j <- 0 until 100){
        A(i)(j) = readLine().toInt
        B(i*100+j) = A(i)(j)
    }

    for (i <- 0 until 100){
        rangeMax(i) = A(i).max
    }

    for (i <- 0 until K){
        val line = readLine().split(" ").map(_.toInt)
        val l = line(0)-1
        val r = line(1)-1
        var now = l
        ans = B(l)

        while (now <= r) {
            if (now % 100 == 0 && now + 99 <= r) {
                ans = List(ans, rangeMax(now / 100)).max
                now = now + 100
            } else {
                ans = List(ans, B(now)).max
                now = now + 1
            }
        }
        println(ans)
    }
}

//解答例使用済み
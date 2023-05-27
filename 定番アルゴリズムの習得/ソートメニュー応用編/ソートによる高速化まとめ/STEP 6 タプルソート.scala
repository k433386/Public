import scala.io.StdIn._

object Main extends App {

    val Array(n, m, k) = readLine().split(" ").map(_.toInt)
    val a = Array.ofDim[Int](n, m)

    for (i <- 0 until n){
        a(i) = readLine().split(" ").map(_.toInt)
    }

    def withSort(x: Array[Array[Int]]): Array[Array[Int]] = {
        val m = a(0).length

        val sorted = a.sortWith { (row1, row2) =>
            if (row1(k - 1) != row2(k - 1)) {
                row1(k - 1) < row2(k - 1)
            } else {
                var i = 0
                while (i < m && row1(i) == row2(i)) {
                    i = i + 1
                }
                if (i == m) {
                    false
                } else {
                    row1(i) < row2(i)
                }
            }
        }
        return sorted
    }

    val result = withSort(a)
    for (line <- result){
        println(line.mkString(" "))
    }
}
//解答例使用済み
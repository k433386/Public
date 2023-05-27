import scala.io.StdIn._

object Main extends App {

    val Array(n, x) = readLine().split(" ").map(_.toLong)
    val a = readLine().split(" ").map(_.toLong)

    def searchSumMinCount(line: Array[Long], target: Long): Long = {
        var count = 0L
        var tmp = 0L
        for (i <- line){
            tmp = tmp + i
            count = count + 1
            if (tmp >= target){
                return count
            }
        }
        return -1L
    }
    println(searchSumMinCount(a.sorted.reverse, x))
}
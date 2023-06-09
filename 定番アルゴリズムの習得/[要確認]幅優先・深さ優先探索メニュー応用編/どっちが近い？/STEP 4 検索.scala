import scala.io.StdIn._
import scala.collection.mutable.Queue

object Main extends App {

    val Array(n, m, x, y, z) = readLine().split(" ").map(_.toInt)
    val c = readLine().split(" ").map(_.toInt)
    val graph = Array.fill(n)(List.empty[Int])

    for (_ <- 0 until m) {
        val Array(a, b) = readLine().split(" ").map(_.toInt - 1)
        graph(a) ::= b
        graph(b) ::= a
    }

    val q = Queue[Int](x-1)
    val dist = Array.fill(n)(-1)
    dist(x-1) = 0

    while (q.nonEmpty) {
        val now = q.dequeue()
        for (next <- graph(now)) {
            if (dist(next) == -1) {
                dist(next) = dist(now) + 1
                q.enqueue(next)
            }
        }
    }

    val ans = for {
        i <- 0 until n
        if 5 * dist(i) <= y && c(i) == z
    } yield i + 1

    println(ans.length)
    ans.foreach(println)
}
//解答例使用済み
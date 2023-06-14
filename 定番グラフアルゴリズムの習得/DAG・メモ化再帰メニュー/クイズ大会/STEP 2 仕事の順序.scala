import scala.io.StdIn._
import scala.collection.mutable.ArrayBuffer

object Main extends App {

    val jobRelation = Array.fill(100000)(ArrayBuffer.empty[Int])
    val memo = Array.fill(100000)(-1L)

    def jobSeqCount(job: Int): Long = {
        if (memo(job) != -1) {
            return memo(job)
        }
        if (jobRelation(job).isEmpty) {
            return {
            memo(job) = 1
            1
            }
        }
        var count = 0L
        for (i <- 0 until jobRelation(job).size) {
            count += jobSeqCount(jobRelation(job)(i))
            count %= 1000000007
        }
        memo(job) = count
        count
    }

    val Array(n, k) = readLine().trim().split(" ").map(_.toInt)
    for (_ <- 0 until k) {
        val Array(j, w) = readLine().trim().split(" ").map(_.toInt - 1)
        jobRelation(w) += j
    }
    for (i <- 0 until n) {
        jobRelation(i) = jobRelation(i).sorted.reverse
    }
    println(jobSeqCount(n - 1))
}

//解答例使用済み
//問題文の意図が分からない

/*
import scala.io.StdIn._

object Main extends App {

    val Array(n, k) = readLine().trim().split(" ").map(_.toInt)
    val graph: Map[Int, List[Int]] = (0 until k).foldLeft(Map.empty[Int, List[Int]]) { (map, _) =>
        val Array(j, w) = readLine().trim().split(" ").map(_.toInt)
        if (map.contains(j)) {
            map + (j -> (w :: map(j)))
        } else {
            map + (j -> (w :: Nil))
        }
    }

    def dfs(start: Int, ): Int = {
        if (start == n) 1
        else {
            graph(start).map(next => dfs(next)).sum
        }
    }
    
    //println((1 to n-1).map(i => dfs(i)).sum)
    (1 to n-1).foreach(i => println(dfs(i)))
    println(graph)
}
*/
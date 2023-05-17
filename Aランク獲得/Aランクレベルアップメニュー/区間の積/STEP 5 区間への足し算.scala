import scala.io.StdIn._

object Main extends App {

    val line = readLine().split(" ").map(_.toInt)
    val N = line(0)
    val M = line(1)
    var An = readLine().split(" ").map(_.toInt)
    var add = Array.fill(N+1)(0)

    for (i <- 0 until M){
        val lua = readLine().split(" ").map(_.toInt)
        val l = lua(0)
        val u = lua(1)
        val a = lua(2)

        add(l-1) = add(l-1) + a
        add(u) = add(u) - a
    }
    
    for (i <- 0 until N){
        println(An(i)+add(i))
        if (i+1 < N+1){
            add(i+1) = add(i+1) + add(i)
        }
    }
}
//解答例使用済み

/*
import scala.io.StdIn._

object Main extends App {

    val line = readLine().split(" ").map(_.toInt)
    val N = line(0)
    val M = line(1)
    var An = readLine().split(" ").map(_.toInt)

    for (i <- 0 until M){
        val lua = readLine().split(" ").map(_.toInt)
        val l = lua(0)
        val u = lua(1)
        val a = lua(2)

        val front = An.take(l-1)
        val line = An.drop(l-1).take(u-l+1)
        val rear = An.drop(u)
        An = front ++ line.map(_ + a) ++ rear
    }
    
    for (i <- An){
        println(i)
    }
}
*/
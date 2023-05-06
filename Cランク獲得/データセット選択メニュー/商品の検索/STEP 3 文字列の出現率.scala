import scala.io.StdIn._

object Main extends App {

    val N = readLine().toInt
    var Sarray : Array[String] = Array.empty

    for (i <-0 until N){
        Sarray = Sarray ++ Array(readLine())
    }

    val nList = Sarray.distinct.sorted

    for (i <- 0 until nList.length){
        println(s"${nList(i)} ${Sarray.count(x => x == nList(i))}")
    }
}

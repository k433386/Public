import scala.io.StdIn._

object Main extends App {

    val line = readLine().split(" ")
    val p = line(0).toInt
    val q = line(1).toInt
    val r = line(2).toInt
    var ijMap = Map.empty[Int, Int]
    var jkMap = Map.empty[Int, Int]

    for (i <- 0 until p){
        val tmp1 = readLine.split(" ").map(_.toInt)
        ijMap = ijMap + (tmp1(0) -> tmp1(1))
    }
    for (i <- 0 until q){
        val tmp2 = readLine.split(" ").map(_.toInt)
        jkMap = jkMap + (tmp2(0) -> tmp2(1))
    }

    for (i <- 1 to p){
        println(s"${i} ${jkMap(ijMap(i))}")
    }

}

//https://gside.org/articles/scala/map/
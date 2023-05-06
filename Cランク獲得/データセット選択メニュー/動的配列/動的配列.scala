import scala.io.StdIn._

object Main extends App {

    val line = readLine().split(" ")
    val N = line(0).toInt
    val Q = line(1).toInt
    var Aline = readLine().split(" ").map(_.toInt)
    var query = Array.ofDim[Int](Q, 2)

    for (i <- 0 until Q){
        var tmp = readLine()
        if (tmp == "1"){
            query(i) = Array(1, 0)
        } else if (tmp == "2"){
            query(i) = Array(2, 0)
        } else {
            query(i) = tmp.split(" ").map(_.toInt)
        }
    }
    for (i <- query){
        if (i(0) == 0){
            Aline = Aline ++ Array(i(1))

        } else if (i(0) == 1){
            Aline = Aline.take(Aline.length-1)

        } else if (i(0) == 2){
            println(Aline.mkString(" "))
        }
    }
}

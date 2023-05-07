import scala.io.StdIn._

object Main extends App {

    val num = readLine().split(" ")
    val N = num(0).toInt    
    val Q = num(1).toInt    
    var Sline = Array.ofDim[Int](Q, 3)
    var people = (1 to N).toArray

    for (i <- 0 until Q){
        var tmp = readLine()
        if (tmp == "reverse"){
            Sline(i) = Array(1, 0, 0)
        } else {
            val line = tmp.split(" ")
            if (line(0) == "resize"){
                Sline(i) = Array(2, line(1).toInt, 0)
            } else {
                Sline(i) = Array(0, line(1).toInt, line(2).toInt)
            }
        }
    }
    for (i <- Sline){
        if (i(0) == 0){
            var tmp2 = 0
            tmp2 = people(i(1)-1)
            people(i(1)-1) = people(i(2)-1)
            people(i(2)-1) = tmp2

        } else if (i(0) == 1){
            people = people.reverse

        } else if (i(0) == 2 && people.length > i(1)){
            people = people.take(i(1))
        }
    }
    for (i <- people){
        println(i)
    }
}

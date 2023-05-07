import math._

object Main extends App {

    var value : Array[Int] = Array.empty
    var index : Array[String] = Array.empty

    for (i <- 1 to 100) {
        for (j <- 1 to 100) {
            if (i+j < 100 && pow(i, 3) + pow(j, 3) < 100000){
                value = value ++ Array(i * j)
                index = index ++ Array(s"${i} ${j}")
            }
        }
    }
    val line = index(value.indexOf(value.max)).split(" ").map(_.toInt)
    println(line(0) * line(1))
}
import scala.io.StdIn._

object Main extends App {

    val line = readLine().split(" ")
    val X = line(0).toInt
    val Y = line(1).toInt
    val Z = line(2).toInt
    var count : Array[Int] = Array.empty

    for (x <- 0 to 3000) {
        for (y <- 0 to 3000) {
            if (x*X + y*Y <= Z){
                count = count ++ Array(Z-(x*X+y*Y)+x+y) 
            }
        }
    }

    println(count.min)
}
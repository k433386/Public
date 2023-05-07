import scala.io.StdIn._

object Main extends App {

    val N = readLine().toInt
    var result = 0

    for (i <- 2 to N){
        var count = 0
        for (j <- 1 to N){
            if(i % j == 0){
                count = count + 1
            }
        }
        if(count == 2){
            result = result + 1
        }
    }
    println(result)
}
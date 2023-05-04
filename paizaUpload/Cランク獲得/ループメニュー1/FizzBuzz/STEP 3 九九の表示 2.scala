import scala.io.StdIn._

object Main extends App {

    val num = readLine().toInt
    val key = 9
    var result = ""

    for (i <- 0 until key){
        result = result + s"${num*(i.toInt+1)}"

        if (i < key-1){
            result = result + " "
        }
    }
    println(result)
}

import scala.io.StdIn._

object Main extends App {

    class node(val value: Int, val next: Int){
        def getValue() : Int = {
            value
        }
        def getNext() : Int = {
            next
        }
    }

    val n = readLine().trim().toInt
    val list = Array.ofDim[node](1024)

    list(0) = new node(-1, 1023)
    list(1023) = new node(-1, -1)

    var back = 0
    var emptyMinIndex = 1

    for (i <- 0 until n){
        println(readLine().trim().toInt)
    }
}

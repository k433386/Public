import scala.io.StdIn._

object Main extends App {

    class node(i: Int, j: Int){
        var value = i
        var next = j
        def getValue() : Int = {
            value
        }
        def getNext() : Int = {
            next
        }
        def updateValue(x: Int) = {
            value = x
        }
        def updateNext(x: Int) = {
            next = x
        }
    }

    val n = readLine().trim().toInt
    val list = Array.ofDim[node](1024)

    list(0) = new node(-1, 1023)
    list(1023) = new node(-1, -1)

    var back = 0
    var emptyMinIndex = 1

    for (i <- 0 until n){
        val tmp = readLine().trim().toInt
        list(emptyMinIndex) = new node(tmp, list(emptyMinIndex-1).getNext)
        list(emptyMinIndex-1).updateNext(emptyMinIndex)
        back = emptyMinIndex
        emptyMinIndex = emptyMinIndex + 1
    }

    def printOut(list: Array[node]) = {
        var next = list(0).getNext
        while (next != 1023){
            println(list(next).getValue)
            next = list(next).getNext
        }
    }
    printOut(list)
}

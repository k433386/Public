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

    val Array(n, k) = readLine().split(" ").map(_.toInt)
    val list = Array.ofDim[node](1024)

    list(0) = new node(-1, 1023)
    list(1023) = new node(-1, -1)

    var back = 0
    var emptyMinIndex = 1

    for (i <- 0 until n){
        def addTop() = {
            val data = readLine().trim().toInt
            list(emptyMinIndex) = new node(data, list(0).getNext)
            list(0).updateNext(emptyMinIndex)
            emptyMinIndex = emptyMinIndex + 1
        }
        def addTail() = {
            val data = readLine().trim().toInt
            list(emptyMinIndex) = new node(data, list(emptyMinIndex-1).getNext)
            list(emptyMinIndex-1).updateNext(emptyMinIndex)
            back = emptyMinIndex
            emptyMinIndex = emptyMinIndex + 1
        }
        addTail()
    }
    for (i <- 0 until k){
        def deleteTop() = {
            list(0).updateNext(list(list(0).getNext).getNext)
        }
        def deleteTail() = {
            list(back-1).updateNext(list(back).getNext)
            back = back - 1
        }
        deleteTop()
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

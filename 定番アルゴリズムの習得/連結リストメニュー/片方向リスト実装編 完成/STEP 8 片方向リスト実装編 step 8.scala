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

    val Array(n, l, r) = readLine().split(" ").map(_.toInt)
    val list = Array.ofDim[node](1024)

    list(0) = new node(-1, 1023)
    list(1023) = new node(-1, -1)

    var back = 0
    var emptyMinIndex = 1

    def addTop(data: Int) = {
        list(emptyMinIndex) = new node(data, list(0).getNext)
        list(0).updateNext(emptyMinIndex)
        emptyMinIndex = emptyMinIndex + 1            
    }
    def addTail(data: Int) = {
        list(emptyMinIndex) = new node(data, list(emptyMinIndex-1).getNext)
        list(emptyMinIndex-1).updateNext(emptyMinIndex)
        back = emptyMinIndex
        emptyMinIndex = emptyMinIndex + 1
    }
    def addInsert(data: Int, index: Int) = {
        def search(): (Int, Int) = {
            var next = list(0).getNext
            var prev = 0
            for (i <- 0 until index-1){
                prev = next
                next = list(next).getNext
            }
            return (prev, next)
        }
        val (prevIndex, nextIndex) = search()
        list(emptyMinIndex) = new node(data, nextIndex)
        list(prevIndex).updateNext(emptyMinIndex)
        if (nextIndex == 1023){
            back = emptyMinIndex
        }
        emptyMinIndex = emptyMinIndex + 1
    }
    def deleteTop() = {
        list(0).updateNext(list(list(0).getNext).getNext)
    }
    def deleteTail() = {
        list(back-1).updateNext(list(back).getNext)
        back = back - 1
    }
    def deleteRange(l: Int, r: Int) = {
        var currentIndex = list(0).getNext
        var prevIndex = 0
        var count = 1
        while (count < l) {
            prevIndex = currentIndex
            currentIndex = list(currentIndex).getNext
            count = count + 1
        }

        var deleteCount = 0
        while (count < r) {
            val nextIndex = list(currentIndex).getNext
            list(prevIndex).updateNext(nextIndex)

            if (currentIndex == back) {
                back = prevIndex
            }
        currentIndex = nextIndex
        count = count + 1
        deleteCount = deleteCount + 1
        }
        emptyMinIndex = emptyMinIndex - deleteCount
    }

    for (i <- 0 until n){
        addTail(readLine().trim().toInt)
    }
    deleteRange(l, r)

    def printOut(list: Array[node]) = {
        var next = list(0).getNext
        while (next != 1023){
            println(list(next).getValue)
            next = list(next).getNext
        }
    }
    printOut(list)
}

/*
    def deleteInsert(index: Int) = {
        def search(): (Int, Int) = {
            var next = list(0).getNext
            var prev = 0
            for (i <- 0 until index-1){
                prev = next
                next = list(next).getNext
            }
            return (prev, next)
        }
        val (prevIndex, nextIndex) = search()
        list(prevIndex).updateNext(list(nextIndex).getNext)
        if (nextIndex == back){
            back = prevIndex
        }
    }
*/
import scala.io.StdIn._

object Main extends App {
    class Node(var value: Int, var next: Int)

    val value = Array.fill[Option[Int]](1024)(None)
    val nextPtr = Array.fill[Option[Int]](1024)(None)
    var emptyMinIndex = 1
    var back = 0
    val startPtr = 0
    val endPtr = 1023

    def pushBack(a: Int): Unit = {
        value(emptyMinIndex) = Some(a)
        nextPtr(back) = Some(emptyMinIndex)
        nextPtr(emptyMinIndex) = Some(endPtr)
        back = emptyMinIndex
        emptyMinIndex += 1
    }

    def insert(pos: Int, `val`: Int): Unit = {
        def search(): (Int, Int) = {
            var currentPtr = startPtr
            var i = 0
            while (i < pos) {
                if (currentPtr == endPtr) {
                    return (endPtr, endPtr)
                }
                currentPtr = nextPtr(currentPtr).getOrElse(endPtr)
                i += 1
            }
            (currentPtr, nextPtr(currentPtr).getOrElse(endPtr))
        }

        val (prevIndex, nextIndex) = search()
        value(emptyMinIndex) = Some(`val`)
        nextPtr(prevIndex) = Some(emptyMinIndex)
        nextPtr(emptyMinIndex) = Some(nextIndex)
        if (nextIndex == endPtr) {
            back = emptyMinIndex
        }
        emptyMinIndex += 1
    }

    def erase(pos: Int): Unit = {
        def search(): (Int, Int) = {
            var currentPtr = startPtr
            var i = 0
            while (i < pos) {
                if (currentPtr == endPtr) {
                    return (endPtr, endPtr)
                }
                currentPtr = nextPtr(currentPtr).getOrElse(endPtr)
                i += 1
            }
            (currentPtr, nextPtr(currentPtr).getOrElse(endPtr))
        }
        val (prevIndex, nextIndex) = search()
        nextPtr(prevIndex) = nextPtr(nextIndex)
        if (nextIndex == back) {
            back = prevIndex
        }
    }

    def printListValues(): Unit = {
        var currentPtr = nextPtr(startPtr).getOrElse(endPtr)
        while (currentPtr != endPtr) {
            value(currentPtr).foreach(println)
            currentPtr = nextPtr(currentPtr).getOrElse(endPtr)
        }
    }

    val Array(n, q) = StdIn.readLine().split(" ").map(_.toInt)
    value(startPtr) = Some(-1)
    value(endPtr) = Some(-1)
    nextPtr(startPtr) = Some(endPtr)
    nextPtr(endPtr) = Some(-1)

    for (_ <- 0 until n) {
        val a = StdIn.readInt()
        pushBack(a)
    }

    for (_ <- 0 until q) {
        val query = StdIn.readLine().split(" ").map(_.toInt)
        if (query(0) == 1) {
            val p = query(1) - 1
            val x = query(2)
            insert(p, x)
        } else if (query(0) == 2) {
            val p = query(1) - 1
            erase(p)
        }
    }

    printListValues()
}


//解答例使用済み
//断念
/*
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
        def updateNext(x: Int) = {
            next = x
        }
    }

    val Array(n, q) = readLine().split(" ").map(_.toInt)
    val list = Array.ofDim[node](1024)
    var COUNT = 0

    list(0) = new node(-1, 1023)
    list(1023) = new node(-1, -1)

    var back = 0
    var emptyMinIndex = 1

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

    for (i <- 0 until n){
        addTail(readLine().trim().toInt)
        COUNT = COUNT + 1
    }
    for (i <- 0 until q){
        val query = readLine().split(" ").map(_.toInt)
        query(0) match {
            case 1 => {
                val p = query(1)
                val x = query(2)
                if (p <= COUNT){
                    addInsert(x, p)
                    COUNT = COUNT + 1 
                } else if (p == COUNT+1){
                    addTail(x)
                    COUNT = COUNT + 1 
                }
            }
            case 2 => {
                val p = query(1)
                deleteInsert(p)
                COUNT = COUNT - 1
            }
        }  
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
*/
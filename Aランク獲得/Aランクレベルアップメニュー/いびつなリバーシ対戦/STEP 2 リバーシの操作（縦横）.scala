import scala.io.StdIn._

object Main extends App {
    val Array(h, w, y, x) = readLine().split(" ").map(_.toInt)
    val s = Array.ofDim[String](h, w)

    for (y <- 0 until h) {
        s(y) = readLine().split("")
    }

    def checkRow(x: Int, y: Int, s: Array[Array[String]]): Unit = {
        for (lr <- List(-1, 1)) {
            innerFunc()
            def innerFunc(): Unit = {
                var i = 0
                while (true) {
                    i = i + 1
                    if (x + i * lr < 0 || x + i * lr >= w) {
                        return
                    }
                    if (s(y)(x + i * lr) == "*") {
                        for (j <- (Array(x + i * lr, x).min to Array(x + i * lr, x).max)) {
                            s(y)(j) = "*"
                        }
                        return
                    }
                }
            }
        }
    }

    def checkColumn(x: Int, y: Int, s: Array[Array[String]]): Unit = {
        for (lr <- List(-1, 1)) {
            innerFunc()
            def innerFunc(): Unit = {
                var i = 0
                while (true) {
                    i = i + 1
                    if (y + i * lr < 0 || y + i * lr >= h) {
                        return
                    }
                    if (s(y + i * lr)(x) == "*") {
                        for (j <- (Array(y + i * lr, y).min to Array(y + i * lr, y).max)) {
                            s(j)(x) = "*"
                        }
                        return
                    }
                }
            }
        }
    }

    s(y)(x) = "*"
    checkRow(x, y, s)
    checkColumn(x, y, s)

    for (i <- s) {
        println(i.mkString(""))
    }
}
//解答例使用済み

/*
import scala.io.StdIn._
import math.abs

object Main extends App {
 
    val line = readLine().split(" ")
    val H = line(0).toInt
    val W = line(1).toInt
    val Y = line(2).toInt
    val X = line(3).toInt
    val Sh = Array.ofDim[String](H, W)

    for (i <- 0 until H){
        Sh(i) = readLine().split("")
    }

    def inMap(y: Int, x: Int) : Boolean = {
        (0 <= y && y < H && 0 <= x && x < W)
    }

    def playMain(board: Array[Array[String]], yx: (Int, Int)): Array[Array[String]] = {
        def preSearch(board: Array[Array[String]], yx: (Int, Int)): List[(Int, Int, Int)] = {
            val (y,x) = yx
            for (i <- 0 until H; j <- 0 until W){
                if (i == y && j == x){
                    board(i)(j) = "*"
                }
            }
            def innerFunc(i: Int, j: Int, y: Int, x: Int): (Int, Int, Int) = {
                if (i==y){
                    return (i, j, abs(x-j))
                }
                else if (j==x){
                    return (i, j, abs(y-i))
                }
                else{
                    return (i, j, 0)
                } 
            }
            val stoneList: List[(Int, Int, Int)] = (0 until H).foldLeft(List.empty[(Int, Int, Int)]){
                (acc, i) => (0 until W).foldLeft(acc){
                    (innerAcc, j) => if (board(i)(j) == "*" && (i==y || j==x)) {innerFunc(i,j,y,x) :: innerAcc} else {innerAcc}
                }
            }
            return stoneList.filterNot(_ == (y, x, 0))
        }
        
        val (ay, ax) = yx
        val stoneList = preSearch(board, yx)
        val yPlotList = stoneList.filter { case (_, b, c) => 
            stoneList.count {
                case (_, x, _) => (b == x && x == ax) } == 1 || 
            stoneList.exists { 
                case (_, x, z) => (b == x && x == ax && c < z) }
        }
        val xPlotList = stoneList.filter { case (a, _, c) => 
            stoneList.count {
                case (y, _, _) => (a == y && y == ay) } == 1 || 
            stoneList.exists { 
                case (y, _, z) => (a == y && y == ay && c < z) }
        }

        def plotFunc(board: Array[Array[String]], pList: List[(Int, Int, Int)]) = {
            for (k <- pList){
                val (tarY, tarX, dist) = k
                if (tarY == ay){
                    for (i <- Array(tarX, ax).min to Array(tarX, ax).max){
                        board(ay)(i) = "*"
                    }
                }
                else if (tarX == ax){
                    for (i <- Array(tarY, ay).min to Array(tarY, ay).max){
                        board(i)(ax) = "*"
                    }
                }
            }            
        }

        plotFunc(board, yPlotList)
        plotFunc(board, xPlotList)

        return board      
    }

    val result = playMain(Sh, (Y, X))
    for (i <- result){
        println(i.mkString(""))
    }
}
*/
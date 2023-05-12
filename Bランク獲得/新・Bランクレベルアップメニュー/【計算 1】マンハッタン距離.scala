import scala.io.StdIn._
import math._

object Main extends App {

    val P = readLine().split(" ").map(_.toInt)
    val Px = P(0)
    val Py = P(1)
    val N = readLine().toInt
    val data = Array.ofDim[Int](N, 2)
    var ManData : Array[Int] = Array.empty
    var ManIndex : Array[Int] = Array.empty
    var EucData : Array[Int] = Array.empty
    var EucIndex : Array[Int] = Array.empty

    for (i <- 0 until N){
        data(i) = readLine().split(" ").map(_.toInt)
    }
    for (i <- 0 until N){
        Manhattan(data(i), i)
        Euclidean(data(i), i)
    } 

    def Manhattan(x: Array[Int], index: Int) = {
        val resMan = sqrt(pow(x(0)-Px , 2) + pow(x(1)-Py , 2)).toInt
        ManData = ManData ++ Array(resMan)
        ManIndex = ManIndex ++ Array(index+1)
    }
    def Euclidean(x: Array[Int], index: Int) = {
        val resEuc = abs(x(0)-Px) + abs(x(1)-Py).toInt
        EucData = EucData ++ Array(resEuc)
        EucIndex = EucIndex ++ Array(index+1)
    }
    def indexSearch(x : Array[Int], data: Int) : Array[Int] = {
        var tmp : Array[Int] = Array.empty
        for (i <- 0 until x.length){
            if (x(i) == data){
                tmp = tmp ++ Array(i)
            }
        }
        return tmp
    }
    def printout(INDEX: Array[Int], DATA: Array[Int]) : Unit = {
        var count = 0
        for (i <- DATA.distinct.sorted.take(3)){
            for (j <- indexSearch(DATA, i)){
                count = count + 1
                println(INDEX(j))

                if (count == 3) {return}
            }
        }      
    }
    
    printout(ManIndex, ManData)
    printout(EucIndex, EucData)
}
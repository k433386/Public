import scala.io.StdIn._

object Main extends App {

    val n = readLine().toInt
    val An = readLine().split(" ").map(_.toInt)
    val k = readLine().toInt
    val Hk = readLine().split(" ").map(_.toInt)

    def insertionSort(A: Array[Int], n: Int, h: Int) = {
        var num_of_move = 0
        for (i <- 1 until n){
            val x = A(i)
            var j = i - h

            while (j >= 0 && A(j) > x){
                A(j+h) = A(j)
                j = j - h
                num_of_move = num_of_move + 1
            }
            A(j+h) = x
        }
        println(num_of_move)
    }
    def shellSort(A: Array[Int], n: Int, H: Array[Int]) = {
        for (h <- H){
            insertionSort(A, n, h)
        }
    }

    shellSort(An, n, Hk)
}

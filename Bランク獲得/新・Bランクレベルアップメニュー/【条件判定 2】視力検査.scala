import scala.io.StdIn._

object Main extends App {

    val N = readLine().toInt
    var TA : Array[String] = Array.empty
    var TB : Array[String] = Array.empty
    var TC : Array[String] = Array.empty
    var TD : Array[String] = Array.empty

    for (i <- 0 until N){
        val io = readLine().split(" ")
        if (io(0) == "TA"){
            TA = TA ++ Array(io(1))
        } else if (io(0) == "TB"){
            TB = TB ++ Array(io(1))
        } else if (io(0) == "TC"){
            TC = TC ++ Array(io(1))
        } else if (io(0) == "TD"){
            TD = TD ++ Array(io(1))
        }
    }

    def TestFun(test: Array[String]) : Int = {
        var ok = 0
        var ng = 0
        for (i <- test){
            if (i == "ok"){
                ok = ok + 1
            } else if (i == "ng"){
                ng = ng + 1        
            }

            if (ok == 2 && ng < 2){
                return 1
            }
        }
        return 0
    }

    def printOut(rA:Int, rB:Int, rC:Int, rD:Int) = {
        if (rA == 1){
            println("A")
        } else if (rB == 1){
            println("B")
        } else if (rC == 1){
            println("C")
        } else if (rD == 1){
            println("D")
        } else {
            println("E")
        }
    }
    printOut(TestFun(TA), TestFun(TB), TestFun(TC), TestFun(TD))
}
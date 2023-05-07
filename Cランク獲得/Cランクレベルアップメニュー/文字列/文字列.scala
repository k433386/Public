import scala.io.StdIn._

object Main extends App {

    val N = readLine().toInt
    var tL = Array.ofDim[Int](N, 2)
    var hL = Array.ofDim[Int](N)
    var mL = Array.ofDim[Int](N)

    for (i <- 0 until N){
        var tmp = readLine().split(" ")
        tL(i) = tmp(0).split(":").map(_.toInt)
        hL(i) = tmp(1).toInt
        mL(i) = tmp(2).toInt
    }

    for (i <- 0 until N){
        tL(i)(0) = tL(i)(0) + hL(i)
        tL(i)(1) = tL(i)(1) + mL(i)

        if(tL(i)(1) >= 60){
            tL(i)(1) = tL(i)(1) - 60
            tL(i)(0) = tL(i)(0) + 1
        }
        if(tL(i)(0) >= 24){
            tL(i)(0) = tL(i)(0) - 24
        }
    
        if (tL(i)(0) < 10){
            if (tL(i)(1) < 10){
                println(s"0${tL(i)(0)}:0${tL(i)(1)}")
            } else {
                println(s"0${tL(i)(0)}:${tL(i)(1)}")
            }
        } else {
            if (tL(i)(1) < 10){
                println(s"${tL(i)(0)}:0${tL(i)(1)}")
            } else {
                println(s"${tL(i)(0)}:${tL(i)(1)}")
            }
        }
    }
}

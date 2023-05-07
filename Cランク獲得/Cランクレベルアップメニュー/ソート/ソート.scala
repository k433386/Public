import scala.io.StdIn._

object Main extends App {

    val n = readLine().toInt
    var Aline = Array.ofDim[Int](n,2)
    var texLine = Array.ofDim[String](n)

    for (i <- 0 until n){
        val rota = readLine().split(" ").map(_.toInt)
        Aline(i)(0) = rota(1)
        Aline(i)(1) = rota(0) 
    }

    for (i <- 0 until n){
        var red = ""
        var yellow = ""
        if (Aline(i)(0) < 10){
            red =  s"0${Aline(i)(0)}"        
        } else {
            red = s"${Aline(i)(0)}"     
        }
        if (Aline(i)(1) < 10){
            yellow =  s"0${Aline(i)(1)}"        
        } else {
            yellow = s"${Aline(i)(1)}"     
        }
        texLine(i) = red + yellow
    }
    
    val finLine = texLine.sorted.reverse
    for (i <- finLine){
        val tmp = i.split("").map(_.toInt)
        var apple = 0
        var banana = 0
        if (tmp(0)!=0){
            apple = tmp(0)*10 + tmp(1) 
        } else {
            apple = tmp(1)
        }
        if (tmp(2)!=0){
            banana = tmp(2)*10 + tmp(3) 
        } else {
            banana = tmp(3)
        }
        println(s"${banana} ${apple}")
    }
}

import scala.io.StdIn._

object Main extends App {

    val n = readLine().toInt
    var Aline = Array.ofDim[Int](n,2)
    var texLine = Array.ofDim[String](n)

    for (i <- 0 until n){
        Aline(i) = readLine().split(" ").map(_.toInt)
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
        println(s"${apple} ${banana}")
    }
}






/*
https://berrysystems.sakura.ne.jp/karasumaru/2021/04/27/%E3%80%90%E8%A6%9A%E3%81%88%E6%9B%B8%E3%81%8D%E3%80%91paiza%E3%83%AC%E3%83%99%E3%83%AB%E3%82%A2%E3%83%83%E3%83%97%E5%95%8F%E9%A1%8C%E9%9B%86c%E3%83%A9%E3%83%B3%E3%82%AF%E3%83%AC%E3%83%99%E3%83%AB/

import scala.io.StdIn._

object Main extends App {

    val n = readLine().toInt
    var Aline = Array.ofDim[Int](n,2)
    var Bline = Array.ofDim[Int](2,n)
    var Final = Array.ofDim[Int](n,2)

    for (i <- 0 until n){
        Aline(i) = readLine().split(" ").map(_.toInt)
    }

    for (i <- 0 until n){
        for (j <- 0 until 2){
            Bline(i)(j) =  Aline(j)(i) 
        }
    }

    for (i <- 0 until Bline.length){
        val Apple = Bline(i).sorted.reverse
        var result = Apple.max
        var tmp = 0
        for (j <- 0 until Apple.length){
            if (tmp != 0 && tmp != Apple(j)){
                Final(j-1) = Apple(j)
            } else {
                println("banana")
            }
            tmp = Apple(j)
        }
    }

    Final
}

*/
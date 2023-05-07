import scala.io.StdIn._
import math._

object Main extends App {

    val N = readLine().toInt
    var flag = 0
    
    for (a <- 1 to 1000) {
        for (b <- 1 to 1000) {
            if (a > b && flag == 0){
                for (c <- 1 to 1000) {
                    if (N == a+b+c && flag == 0){
                        if (pow(a, 2) == pow(b, 2) + pow(c, 2)){
                            flag = 1
                        }
                    }
                }
            }

        }
    }
    if (flag == 0){
        println("NO")
    } else {
        println("YES")  
    }
}
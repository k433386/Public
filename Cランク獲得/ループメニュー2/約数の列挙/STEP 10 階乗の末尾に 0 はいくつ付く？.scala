import scala.io.StdIn._

object Main extends App {

    var num = readLine().toInt
    var count = 0


    while (num > 5){
        count = count + num/5
        num = num / 5
    }
    println(count)
}

//http://fukiyo.g1.xrea.com/math-qa/kaijou.htm
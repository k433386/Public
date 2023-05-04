import scala.io.StdIn._

object Main extends App {

    var num = readLine().toInt
    var result = 0

    while (num > 0) {
        result = result + num % 10
        num = num / 10
    }
    println(result)
}

//https://qiita.com/fukuda_0000/items/b2a4d390c4735d6a6932
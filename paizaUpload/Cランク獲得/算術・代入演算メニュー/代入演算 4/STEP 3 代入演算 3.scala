import Math._

object Main extends App {

    var numN = 10000

    numN = (numN / 361).round
    numN = numN % 28
    println(numN)  
}

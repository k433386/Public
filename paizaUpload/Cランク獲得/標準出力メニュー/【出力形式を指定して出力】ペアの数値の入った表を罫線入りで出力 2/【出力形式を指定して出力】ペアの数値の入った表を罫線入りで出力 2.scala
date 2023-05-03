import scala.io.StdIn._

object Main extends App {

    val line = readLine().split(" ")
    val row  = line(0).toInt
    val column = line(1).toInt
    val numA = line(2)
    val numB = line(3)

    for (i <- 0 until row){
        var result = ""
        for (j <- 0 until column){
            var setNum = ""
            val tmpA = (numA).toString
            for (l <- 0 until 9-tmpA.length.toInt){
                setNum = setNum + " "
            }
            val resA = setNum + numA
            setNum = ""
            val tmpB = (numB).toString
            for (l <- 0 until 9-tmpB.length.toInt){
                setNum = setNum + " "
            }
            val resB = setNum + numB
            result = result + s"(${resA}, ${resB})"
            if (j < column-1){
                result = result + " | "
            }
        }
        println(result)
        val tmp = result.length.toInt
        result = ""
        for (k <- 0 until tmp){
            result = result + "="
        }
        if (i < row-1){
            println(result)
        }
    }
}

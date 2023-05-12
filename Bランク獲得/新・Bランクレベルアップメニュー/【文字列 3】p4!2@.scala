import scala.io.StdIn._

object Main extends App {

    val S = readLine()

    def leet(S : String) : Boolean = {
        var line = S.split("")

        def replace(Sen: Array[String], From: String, To: String) : Array[String] = {
            val result = Array.ofDim[String](Sen.length)
            for (i <- 0 until Sen.length){
                if (Sen(i) == From){
                    result(i) = To 
                } else {
                    result(i) = Sen(i)
                }
            }
            return result
        }
        line = replace(line, "4", "a")
        line = replace(line, "@", "a")
        line = replace(line, "1", "i")
        line = replace(line, "!", "i")
        line = replace(line, "2", "z")
        
        if (line.mkString("").contains("paiza")){
            return true
        } else {
            return false
        }
    }

    if (S.contains("paiza")){
        println("paiza")
    } else if (leet(S)){
        println("leet")
    } else {
        println("nothing")
    }
}
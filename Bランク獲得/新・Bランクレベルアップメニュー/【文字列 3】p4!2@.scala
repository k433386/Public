import scala.io.StdIn._

object Main extends App {

    val S = readLine()

    def leet(S : String) : Boolean = {
        var line = S.split("")
        if (line.contains("4")){
            line(line.indexOf("4")) = "a"
        }
        if (line.contains("@")){
            line(line.indexOf("@")) = "a"
        }
        if (line.contains("1")){
            line(line.indexOf("1")) = "i"
        }
        if (line.contains("!")){
            line(line.indexOf("!")) = "i"
        }
        if (line.contains("2")){
            line(line.indexOf("2")) = "z"
        }
        
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
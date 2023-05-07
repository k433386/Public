import scala.io.StdIn._

object Main extends App {

    var S = readLine().split(":").map(_.toInt)
    
    if (S(1) < 30){
        S(1) = S(1) + 30
    } else {
        S(0) = S(0) + 1
        S(1) = S(1) - 30
    }

    if (S(0) < 10){
        if (S(1) < 10){
            println(s"0${S(0)}:0${S(1)}")
        } else {
            println(s"0${S(0)}:${S(1)}")
        }
    } else {
        if (S(1) < 10){
            println(s"${S(0)}:0${S(1)}")
        } else {
            println(s"${S(0)}:${S(1)}")
        }
    }
}
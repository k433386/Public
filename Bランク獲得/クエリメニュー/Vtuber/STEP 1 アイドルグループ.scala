import scala.io.StdIn._

object Main extends App {
     
    val NK = readLine().split(" ")
    val N = NK(0).toInt
    val K = NK(1).toInt
    var name : Set[String] = Set.empty
        
    for (i <- 0 until N){
        name = name ++ Set(readLine())
    }

    for (i <- 0 until K){
        val op = readLine().split(" ")
        if (op(0) == "join"){
            name = name ++ Set(op(1))
        } else if (op(0) == "leave") {
            name = name -- Set(op(1))
        } else {
            for (i <- name.toList.sorted){ println(i) }
        }
    }
}
import scala.io.StdIn._

object Main extends App {
     
    val N = readLine().toInt
    var memName : Array[String] = Array.empty
    var supName : Array[String] = Array.empty
    var supData : Map[String, Long] = Map.empty

    for (i <- 0 until N){
        val E = readLine().split(" ")
        val name = E(0)
        val select = E(1)
        if (select == "give"){
            if (supData.contains(name)){
                supData = supData ++ Map(name -> (supData(name) + E(2).toLong)) 
            } else {
                supName = supName ++ Array(name)
                supData = supData ++ Map(name -> E(2).toLong)
            }

        } else if (select == "join"){
            memName = memName ++ Array(name)
        }
    }

    val result =  supData.toSeq.sortBy(_._2).reverse
    for ((name, amount) <- result) {
        println(name)
    }
    for (i <- memName.sorted){ println(i) }
}

import scala.io.StdIn._

object Main extends App {
     
    val N = readLine().toInt
    var memName : Array[String] = Array.empty
    var supName : Array[String] = Array.empty
    var supData : Map[String, Long] = Map.empty

    for (_ <- 0 until N){
        val E = readLine().split(" ")
        val name = E(0)
        val select = E(1)
        if (select == "give"){
            val amount = E(2).toLong
            if (supData.contains(name)){
                supData = supData.updated(name, supData(name) + amount)
            } else {
                supName = supName ++ Array(name)
                supData = supData ++ Map(name -> amount)
            }

        } else if (select == "join"){
            memName = memName ++ Array(name)
        }
    }

    def withSort(x: Map[String, Long]) : Seq[(String, Long)] = {
        val tmp = x.toSeq.sortWith {
            case ((name1, amount1), (name2, amount2)) => {
                if (amount1 != amount2) {
                    amount1 > amount2
                } else {
                    name1 > name2
                }
            } 
        }
        tmp       
    }
    
    //val result =  supData.toSeq.sortBy(_._2).reverse
    val result = withSort(supData)

    for ((name, _) <- result) { println(name) }
    for (i <- memName.sorted){ println(i) }
}

//sortWithは安心
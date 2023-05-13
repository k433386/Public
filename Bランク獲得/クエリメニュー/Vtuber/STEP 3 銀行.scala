import scala.io.StdIn._

object Main extends App {
     
    val NK = readLine().split(" ")
    val N = NK(0).toInt
    val K = NK(1).toInt
    var keyList : Array[String] = Array.empty
    var keyData : Map[String, String] = Map.empty
    var valueData : Map[String, Int] = Map.empty
    val GMWk = Array.ofDim[String](K, 3)

    for (i <- 0 until N){
        val line = readLine().split(" ")
        keyList = keyList ++ Array(line(0))
        keyData = keyData ++ Map(line(0) -> line(1))
        valueData = valueData ++ Map(line(0) -> line(2).toInt)
    }
    for (i <- 0 until K){
        GMWk(i) = readLine().split(" ")
    }

    for (i <- 0 until K){
        val ID = GMWk(i)(0)
        val Pass = GMWk(i)(1)
        val Cash = GMWk(i)(2).toInt

        if (keyData(ID) == Pass){
            valueData = valueData ++ Map(ID -> (valueData(ID) - Cash))
        }
    }
    for (i <- keyList){
        println(s"${i} ${valueData(i)}")
    }
}
import scala.io.StdIn._

object Main extends App {
     
    val NK = readLine().split(" ")
    val N = NK(0).toInt
    val K = NK(1).toInt
    var keyList : Array[String] = Array.empty
    var keyData : Map[String, String] = Map.empty

    for (i <- 0 until N){
        keyList = keyList ++ Array(readLine())
    }

    for (i <- 0 until K){
        val l = readLine().split(" ")
        val A = l(0)
        val P = l(1)
        val M = l(2)
        val PM = (P + "/" + M)
        if (keyData.contains(A)){
            val tmp = keyData(A).mkString("") + " " + PM
            keyData = keyData ++ Map(A -> tmp)
        } else {
            keyData = keyData ++ Map(A -> PM)
        }
    }

    for (i <- keyList){
        println(i)

        if (keyData.contains(i)){
            for (j <- keyData(i).split(" ")){
                println(j.split("/").mkString(" "))
            }       
        }
        println("-----")   
    }
}
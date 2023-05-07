import scala.io.StdIn._

object Main extends App {

    val N = readLine().toInt
    var Aline = Array.ofDim[Int](N)
    var RRline : Array[Int] = Array.empty
    var REline : Array[String] = Array.empty

    for (i <- 0 until N){
        Aline(i) = readLine().toInt
    }

    for (i <- 0 until N){
        for (j <- 1 until N){
            if (i < j){
                var comp1 = Aline(i)
                var comp2 = Aline(j)
                if (comp1 > comp2){
                    var tmp = comp1
                    comp1 = comp2
                    comp2 = tmp
                }
                RRline = RRline ++ Array(comp2 - comp1)
                REline = REline ++ Array(s"${comp1} ${comp2}")
            }
        }
    }

    val index = RRline.indexOf(RRline.min)
    for (i <- REline(index).split(" ")){
        println(i)
    }
}
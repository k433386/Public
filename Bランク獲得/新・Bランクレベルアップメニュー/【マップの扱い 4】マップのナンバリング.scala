import scala.io.StdIn._

object Main extends App {

    val HWD = readLine().split(" ").map(_.toInt)
    val H = HWD(0)
    val W = HWD(1)
    val D = HWD(2)
    val stage = Array.ofDim[Int](H, W)

    def F1(){
        val start = Array(0, 0)
        var now = start
        for (i <- 1 until H*W){
            var newP = Array(now(0)-1, now(1)+1)
            if (newtmp(0) < H){
                newP = Array(now(0)-1, now(1)+1)
            }
            now = Array(now(0)-1, now(1)+1)
        }

    }
}
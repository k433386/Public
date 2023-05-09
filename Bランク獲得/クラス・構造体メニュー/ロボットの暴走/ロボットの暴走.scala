import scala.io.StdIn._

object Main extends App {

    class robot1(var level: Int, var W: Int, var H: Int, val data: Array[Array[Int]]){
        var step = 1

        def levelStep() = {
            if (level == 1){
                step = 1
            } else if (level == 2){
                step = 2
            } else if (level == 3){
                step = 5
            } else if (level == 4){
                step = 10
            }
        }
        def move(dir: String) = {
            levelStep()
            if (dir == "N"){
                H = H - step
            } else if (dir == "S"){
                H = H + step
            } else if (dir == "E"){
                W = W + step
            } else if (dir == "W"){
                W = W - step
            }
            conflict()
        }
        def conflict() = {
            for (i <- boxes){
                if (i(0) == W && i(1) == H){
                    level = level + 1
                    if (level > 4){
                        level = 4
                    }
                }
            }
        }
        def printout() = {
            println(s"${W} ${H} ${level}")
        }
    }

    var robots: Array[robot1] = Array.empty
    var boxes = Array.ofDim[Int](10, 2)    
    
    val HWNK = readLine().split(" ")
    val H = HWNK(0).toInt
    val W = HWNK(1).toInt
    val N = HWNK(2).toInt
    val K = HWNK(3).toInt

    for(i <- 0 until 10){
        val box = readLine().split(" ").map(_.toInt)
        boxes(i) = box
    }

    for(i <- 0 until N){
        val data = readLine().split(" ").map(_.toInt)
        val robot = new robot1(data(2), data(0), data(1), boxes)
        robots = robots ++ Array(robot)
    }
    
    for(i <- 0 until K){
        val rd = readLine().split(" ")
        val r = rd(0).toInt - 1
        val d = rd(1)

        robots(r).move(d)
    }
    
    for(i <- robots){
        i.printout
    }
}

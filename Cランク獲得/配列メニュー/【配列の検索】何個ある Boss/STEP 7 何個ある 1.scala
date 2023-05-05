object Main extends App {

    val line = Array(1, 2, 2, 1, 2, 1, 2, 1, 1, 1)
    var count = 0

    for (i <- 0 until line.length){
        if (line(i) == 1){
            count = count + 1
        }
    }
    println(count)
}

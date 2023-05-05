object Main extends App {

    val line1 = Array(1, 2, 3, 4, 5, 6)
    val line2 = Array(8, 1, 3, 3, 1, 8)
    val Dline = Array(line1, line2)
    var count = 0

    for (i <- 0 until Dline.length){
        count = count + Dline(i).length
    }
    println(count)
}

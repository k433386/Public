object Main extends App {

    val line1 = Array(6, 5, 4, 3, 2, 1)
    val line2 = Array(3, 1, 8, 8, 1, 3)
    val Dline = Array(line1, line2)

    for (i <- 0 until Dline.length){
        println(Dline(i).mkString(" "))
    }
}

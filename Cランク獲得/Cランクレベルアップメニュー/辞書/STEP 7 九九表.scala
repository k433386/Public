object Main extends App {

    val row = 9
    val column = 9

    for (i <- 0 until row){
        var result = ""
        for (j <- 0 until column){
            result = result + s"${(i+1)*(j+1)}"
            if (j < column-1){
                result = result + " "
            }
        }
        println(result)
    }
}

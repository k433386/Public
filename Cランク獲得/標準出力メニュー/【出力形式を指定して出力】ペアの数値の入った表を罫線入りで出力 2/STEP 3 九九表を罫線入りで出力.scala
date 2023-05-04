object Main extends App {

    val row = 9
    val column = 9

    for (i <- 0 until row){
        var result = ""
        var setNum = ""
        for (j <- 0 until column){
            val num = ((i+1)*(j+1)).toString
            if (num.length.toInt==1){
                setNum = s" ${num}"
            } 
            else if (num.length.toInt==2){
                setNum = s"${num}"
            }
            result = result + setNum
            if (j < column-1){
                result = result + " | "
            }
        }
        println(result)
        val tmp = result.length.toInt
        result = ""
        for (k <- 0 until tmp){
            result = result + "="
        }
        if (i < row-1){
        println(result)
        }
    }
}

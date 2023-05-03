object Main extends App {

    var result = ""

    for (i <- 1 until 1001){
        result = s"${result}" + s"${i}"
        if (i < 1000){
            result = s"${result}" + " "
        }
    }
    println(result)
}

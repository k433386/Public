object Main extends App {

    var result = ""

    for (i <- 1 until 11){
        result = s"${result}" + s"${i}"
        if (i < 10){
            result = s"${result}" + " "
        }
    }
    println(result)
}

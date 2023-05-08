object Main extends App {

    val num = 10000
    var count = 0

    while ((num+count) % 13 != 0) {
        count = count + 1
    }
    println(num+count)
}
import scala.io.StdIn._

object Main extends App {

    class basic(){
        var amount = 0
        var past = ""
        var leaving = 0

        def check(menu: String, price: Int) : Int = {
            if (menu == "alcohol" || menu == "0"){
                0
            } else {
                price
            }
        }
        def orderPass(menu: String, price: Int) = {
            if (menu == "A"){
                leaving = 1
                println(amount)
                0
            } else {
                var result = check(menu: String, price: Int)
                amount = amount + result                
            }
        }
        def printout() = {
            println(amount)
        }
    }
    class plus() extends basic {
        amount = 0 
        past = ""
        leaving = 0

        def discount(menu: String, price: Int) : Int = {
            past = past + menu
            if ((past.contains("alcohol") || past.contains("0")) && menu == "food"){
                price - 200
            } else if (menu == "0") {
                500
            } else {
                price
            }
        }
        override def orderPass(menu: String, price: Int) = {
            if (menu == "A"){
                leaving = 1
                println(amount)
                0
            } else {
                var result = discount(menu: String, price: Int)
                amount = amount + result                
            }
        }
    }

    var customers : Array[basic] = Array.empty    
    
    val NK = readLine().split(" ")
    val N = NK(0).toInt
    val K = NK(1).toInt

    for(i <- 0 until N){
        val age = readLine().toInt
        if (age >= 20 ){
            val customer = new plus()
            customers = customers ++ Array(customer)
        } else {
            val customer = new basic()
            customers = customers ++ Array(customer)
        }
    }

    for(i <- 0 until K){
        val line = readLine().split(" ")
        val index = line(0).toInt - 1
        val readMenu = line(1)
        var readPrice = 0
        if (line.length == 3){
            readPrice = line(2).toInt
        }
        customers(index).orderPass(readMenu, readPrice) 
    }

    println(customers.count(_.leaving == 1))
}

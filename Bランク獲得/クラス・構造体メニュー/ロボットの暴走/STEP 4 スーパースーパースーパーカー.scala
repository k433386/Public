import scala.io.StdIn._

object Main extends App {

    class supercar(){
        var mile = 0
        var l = 0
        var f = 0

        def setlf(x: Int, y: Int) = {
            l = x
            f = y
        }
        def run() = {
            if (l > 0){
                l = l - 1
                mile = mile + f
            }
        }
        def fly() = {
            println()
        }
        def teleport() = {
            println()
        }
        def printout() = {
            println(mile)
        }
    }
    class supersupercar() extends supercar {
        mile = 0
        l = 0
        f = 0
        override def fly() = {
            if (l >= 5){
                l = l - 5
                mile = mile + f*f
            } else {
                run()
            }
        }
    }
    class supersupersupercar() extends supersupercar {
        mile = 0
        l = 0
        f = 0
        override def fly() = {
            if (l >= 5){
                l = l - 5
                mile = mile + 2*f*f
            } else {
                run()
            }
        }
        override def teleport() = {
            if (l >= f*f){
                l = l - f*f
                mile = mile + f*f*f*f
            } else {
                fly()
            }
        }
    }
    var cars: Array[supercar] = Array.empty    
    
    val NK = readLine().split(" ")
    val N = NK(0).toInt
    val K = NK(1).toInt

    for(i <- 0 until N){
        val spec = readLine().split(" ")
        if (spec(0) == "supercar"){
            val car = new supercar()
            car.setlf(spec(1).toInt, spec(2).toInt)
            cars = cars ++ Array(car)
        } else if (spec(0) == "supersupercar"){
            val car = new supersupercar()
            car.setlf(spec(1).toInt, spec(2).toInt)
            cars = cars ++ Array(car)
        } else if (spec(0) == "supersupersupercar"){
            val car = new supersupersupercar()
            car.setlf(spec(1).toInt, spec(2).toInt)
            cars = cars ++ Array(car)
        }
    }
    
    for(i <- 0 until K){
        val j = readLine().split(" ")
        val index = j(0).toInt - 1
        val func = j(1)

        if (func == "run"){
            cars(index).run()
        } else if (func == "fly"){
            cars(index).fly()
        } else if (func == "teleport"){
            cars(index).teleport()
        }
    }
    
    for(i <- cars){
        i.printout
    }
}

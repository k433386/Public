import scala.io.StdIn._

object Main extends App {

    class Employee(val number: Int, val name: String){
        def getnum() : Int = {
            number
        }
        def getname() : String = {
            name
        }
    }
    var employees : Array[Employee] = Array.empty    
    
    val N = readLine().toInt

    for(i <- 0 until N){
        val line = readLine().split(" ")
        if (line(0) == "make"){
            val employee = new Employee(line(1).toInt, line(2))
            employees = employees ++ Array(employee)  
        } else if (line(0) == "getnum"){
            println(employees(line(1).toInt-1).getnum())
        } else if (line(0) == "getname"){
            println(employees(line(1).toInt-1).getname())
        }
    }
}

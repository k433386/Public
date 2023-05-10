import scala.io.StdIn._

object Main extends App {

    class Employee(var number: Int, var name: String){
        def getnum() : Int = {
            number
        }
        def getname() : String = {
            name
        }
        def change_num(cNum: Int) = {
            number = cNum
        }        
        def change_name(cName: String) = {
            name = cName
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
        } else if (line(0) == "change_num"){
            employees(line(1).toInt-1).change_num(line(2).toInt)
        } else if (line(0) == "change_name"){
            employees(line(1).toInt-1).change_name(line(2))
        }
    }
}

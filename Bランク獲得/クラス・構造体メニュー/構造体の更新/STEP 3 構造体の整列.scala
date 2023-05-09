import scala.io.StdIn._

object Main extends App {

    class User(val nickname: String, val old: Int, val birth: String, val state: String){
        def printOut = {
            println(s"${nickname} ${old} ${birth} ${state}")
        }
    }
    var users : Array[User] = Array.empty    
    
    val N = readLine().toInt
    for(i <- 0 until N){
        val rl = readLine().split(" ")
        val user = new User(rl(0), rl(1).toInt, rl(2), rl(3))
        users = users ++ Array(user)
    }
    
    val result = users.sortBy(_.old)
    for(i <- result){
        i.printOut
    }
}

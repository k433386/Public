import scala.io.StdIn._

object Main extends App {

    class User(var nickname: String, val old: Int, val birth: String, val state: String){
        def printOut = {
            println(s"${nickname} ${old} ${birth} ${state}")
        }
        def changeName(cName: String) = {
            nickname = cName
        }
    }
    var users : Array[User] = Array.empty    
    
    val NK = readLine().split(" ").map(_.toInt)
    val N = NK(0)
    val K = NK(1)

    for(i <- 0 until N){
        val rl = readLine().split(" ")
        val user = new User(rl(0), rl(1).toInt, rl(2), rl(3))
        users = users ++ Array(user)
    }

    for (i <- 0 until K){
        val ann = readLine().split(" ")
        users(ann(0).toInt-1).changeName(ann(1))
    }

    for(i <- users){
        i.printOut
    }
}

import scala.io.StdIn._

object Main extends App {

    var H = readLine.toInt
    var paiza = Array[Int](0)
    var monster = Array[Int](0)
    var count = 0

    def PaizaAttack(x: Int): Unit = {
        if (x == 1 || x == 2){
            paiza = paiza ++ Array(1)
        } else {
            paiza = paiza ++ Array(monster(x-1) + monster(x-2))
        }
    }
    def MonsterAttack(x: Int): Unit = {
        if (x == 1 || x == 2){
            monster = monster ++ Array(1)
        } else {
            monster = monster ++ Array(paiza(x-1)*2 + paiza(x-2))
        }
    }

    while (H > 0){
        count = count + 1
        PaizaAttack(count)
        MonsterAttack(count)
        H = H - monster(count)
    }
    println(count)
}


/*

import scala.io.StdIn._

object Main extends App {

    var H = readLine.toInt
    var count = 1

    def PaizaAttack(x: Int): Int = {
        if (x == 1 || x == 2){
            1
        } else {
            MonsterAttack(x-1) + MonsterAttack(x-2)
        }
    }
    def MonsterAttack(x: Int): Int = {
        if (x == 1 || x == 2){
            1
        } else {
            PaizaAttack(x-1)*2 + PaizaAttack(x-2)
        }
    } 

    while (H > MonsterAttack(count)){
        H = H - MonsterAttack(count)
        count = count - 1
    }
    println(count)
}

*/
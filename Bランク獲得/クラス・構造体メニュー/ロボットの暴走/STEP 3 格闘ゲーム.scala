import scala.io.StdIn._

object Main extends App {

    class Hero(val states: Array[Int]){
        var HP = states(0)
        var F1 = states(1)
        var A1 = states(2)
        var F2 = states(3)
        var A2 = states(4)
        var F3 = states(5)
        var A3 = states(6)

        def getF(x : Int) : Int = {
            if(x == 1){
                F1
            } else if(x == 2){
                F2
            } else if(x == 3){
                F3
            } else {
                0
            }
        }
        def getA(x : Int) : Int = {
            if(x == 1){
                A1
            } else if(x == 2){
                A2
            } else if(x == 3){
                A3
            } else {
                0
            }
        }
        def powerUp() = {
            def setF1() = {
                if (F1 - 3 < 1){
                    F1 = 1
                } else {
                    F1 = F1 - 3
                }
                A1 = A1 + 5
            }
            def setF2() = {
                if (F2 - 3 < 1){
                    F2 = 1
                } else {
                    F2 = F2 - 3
                }
                A2 = A2 + 5
            }
            def setF3() = {
                if (F3 - 3 < 1){
                    F3 = 1
                } else {
                    F3 = F3 - 3
                }
                A3 = A3 + 5
            }

            if (F1 == 0 && A1 == 0){
                setF2()
                setF3()
            }else if (F2 == 0 && A2 == 0){
                setF1()
                setF3()
            }else if (F3 == 0 && A3 == 0){
                setF1()
                setF2()
            }
        }
        def damage(x : Int) = {
            HP = HP - x
        }
        def alive() : Boolean = {
            if (HP > 0){
                true
            } else {
                false
            }
        }
        def printout() = {
            println(s"${HP} / ${F1} ${A1} ${F2} ${A2} ${F3} ${A3}")
        }
    }

    var heroes : Array[Hero] = Array.empty    
    
    val NK = readLine().split(" ")
    val N = NK(0).toInt
    val K = NK(1).toInt

    for(i <- 0 until N){
        val states = readLine().split(" ").map(_.toInt)
        val hero = new Hero(states)
        heroes = heroes ++ Array(hero)
    }

    for(i <- 0 until K){
        val j = readLine().split(" ").map(_.toInt)
        val p1 = j(0) - 1
        val t1 = j(1)
        val p2 = j(2) - 1
        val t2 = j(3)

        if (heroes(p1).alive && heroes(p2).alive){
            if (heroes(p1).getF(t1) == 0 && heroes(p1).getA(t1) == 0 && heroes(p2).getF(t2) == 0 && heroes(p2).getA(t2) == 0){
                heroes(p1).powerUp
                heroes(p2).powerUp                           
            } else {
                if (heroes(p1).getF(t1) == 0 && heroes(p1).getA(t1) == 0){
                    heroes(p1).powerUp
                    heroes(p1).damage(heroes(p2).getA(t2))
                } else if (heroes(p2).getF(t2) == 0 && heroes(p2).getA(t2) == 0) {
                    heroes(p2).powerUp
                    heroes(p2).damage(heroes(p1).getA(t1))
                } else if(heroes(p1).getF(t1) < heroes(p2).getF(t2)){
                    heroes(p2).damage(heroes(p1).getA(t1))
                } else if(heroes(p1).getF(t1) > heroes(p2).getF(t2)){
                    heroes(p1).damage(heroes(p2).getA(t2))  
                }
            }
        }
    }
    println(heroes.count(_.alive))
}

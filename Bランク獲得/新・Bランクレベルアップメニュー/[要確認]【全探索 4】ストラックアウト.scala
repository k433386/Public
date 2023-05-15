import scala.io.StdIn._

object Main extends App {
    var ans = 0
    var add = 0
    val s = Array.ofDim[Int](9)
    val b = Array.ofDim[Int](9, 4)
    val panels = Array.ofDim[Int](9)

    for (i <- 0 until 9) {
        s(i) = readLine().toInt
        panels(i) = i
        ans += s(i)
    }

  for (i <- 0 until 9) {
    if (i == 4) {
      for (j <- 0 until 4) {
        b(i)(j) = sc.nextInt()
      }
    } else if (i % 2 == 0) {
      for (j <- 0 until 3) {
        b(i)(j) = sc.nextInt()
      }
    } else {
      for (j <- 0 until 2) {
        b(i)(j) = sc.nextInt()
      }
    }
  }

  val l1 = new ArrayList[Array[Integer]]()
  permute(l1, panels.toList, 0)

  for (p <- l1) {
    val openedPanel = new Array[Boolean](9)
    var tmp = 0

    for (i <- 0 until 9) {
      var line = 0

      p(i) match {
        case 0 =>
          line += (if (openedPanel(1) && openedPanel(2)) 1 else 0)
          line += (if (openedPanel(3) && openedPanel(6)) 1 else 0)
          line += (if (openedPanel(4) && openedPanel(8)) 1 else 0)

        case 1 =>
          line += (if (openedPanel(0) && openedPanel(2)) 1 else 0)
          line += (if (openedPanel(4) && openedPanel(7)) 1 else 0)

        case 2 =>
          line += (if (openedPanel(0) && openedPanel(1)) 1 else 0)
          line += (if (openedPanel(5) && openedPanel(8)) 1 else 0)
          line += (if (openedPanel(4) && openedPanel(6)) 1 else 0)

        case 3 =>
          line += (if (openedPanel(0) && openedPanel(6)) 1 else 0)
          line += (if (openedPanel(4) && openedPanel(5)) 1 else 0)

        case 4 =>
          line += (if (openedPanel(0) && openedPanel(8)) 1 else 0)
          line += (if (openedPanel(2) && openedPanel(6)) 1 else 0)
          line += (if (openedPanel(1) && openedPanel(7)) 1 else 0)
          line += (if (openedPanel(3) && openedPanel(5)) 1 else 0)

        case 5 =>
          line += (if (openedPanel(2) && openedPanel(8)) 1 else 0)
          line += (if (openedPanel(3) && openedPanel(4)) 1 else 0)

        case 6 =>
          line += (if (openedPanel(0) && openedPanel(3)) 1 else 0)
          line += (if (openedPanel(2) && openedPanel(4)) 1 else 0)
          line += (if (openedPanel(7) && openedPanel(8)) 1 else 0)

        case 7 =>
          line += (if (openedPanel(1) && openedPanel(4)) 1 else 0)
          line += (if (openedPanel(6) && openedPanel(8)) 1 else 0)

        case 8 =>
          line += (if (openedPanel(2) && openedPanel(5)) 1 else 0)
          line += (if (openedPanel(6) && openedPanel(7)) 1 else 0)
          line += (if (openedPanel(0) && openedPanel(4)) 1 else 0)
      }

      if (line > 0) {
        tmp += b(p(i))(line - 1)
      }

      openedPanel(p(i)) = true
    }

    add = Math.max(add, tmp)
  }

  println(ans + add)

  def permute(l1: ArrayList[Array[Integer]], l2: List[Integer], k: Int): Unit = {
    for (i <- k until l2.size) {
      Collections.swap(l2, i, k)
      permute(l1, l2, k + 1)
      Collections.swap(l2, k, i)
    }

    if (k == l2.size - 1) {
      l1.add(l2.toArray(new Array[Integer](l2.size)))
    }
  }
}

/*
//解答例使用済み

import scala.io.StdIn._
import math._

object Main extends App {

    var S : Array[Int] = Array.empty
    var now = Array.fill(11)(0)
    val b = Array.ofDim[Int](9, 5)
    val strategies = Array(1, 2, 3, 4, 5, 6, 7, 8, 9).permutations
    var stratPoint : Array[Int] = Array.empty

    S = S ++ Array(0)
    for (i <- 0 until 3){
        S = S ++ readLine().split(" ").map(_.toInt)
    }
    for (i <- 0 until 9){
        b(i) = Array(0) ++ readLine().split(" ").map(_.toInt)
    }
    for (strategy <- strategies){
        var point = 0
        for (i <- strategy){
            now(i) = 1
            point = point + S(i)
        }
        stratPoint = stratPoint ++ Array(point)
    }

    println(stratPoint.max)
}
*/
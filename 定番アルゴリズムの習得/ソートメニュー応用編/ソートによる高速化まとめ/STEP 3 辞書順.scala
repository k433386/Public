import scala.io.StdIn._

object Main extends App {

    def findKString(k: Int): String = {
        var count = 0
        for (c1 <- 'a' to 'z'; c2 <- 'a' to 'z'; c3 <- 'a' to 'z') {
            count = count + 1
            if (count == k) {
                return s"${c1}${c2}${c3}"
            }
        }
        ""
    }

    val k = readLine().toInt
    val result = findKString(k)
    println(result)
}
//解答例使用済み


/*
import scala.io.StdIn._
import scala.collection.mutable.ArrayDeque

object Main extends App {
    
    def convertTo26base(x: Int): Array[Int] = {
        val base = 26
        val tmp = ArrayDeque[Int]()

        var q = x
        while(q > 0){
            tmp.append((q-1) % base)
            q = (q-1) / base
        }
        while (tmp.length < 3){
            tmp.append(0)
        }
        println(tmp.mkString(" "))
        return tmp.toArray.reverse
    }

    def convertToAlpha(st: Array[Int]): Array[Char] = {
        st.map(x => ('a' + x).toChar)
    }

    val k = readLine().toInt
    val result = convertToAlpha(convertTo26base(k))
    println(result.mkString(""))
}

*/
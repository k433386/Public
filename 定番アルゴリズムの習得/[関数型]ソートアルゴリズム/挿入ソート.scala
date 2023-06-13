import scala.io.StdIn._

object Main extends App {

    val A = readLine().trim().split(" ").toList.map(_.toInt)

    def isort[T](less: (T, T) => Boolean)(xs: List[T]): List[T] = {
        if (xs.isEmpty) Nil
        else insert(less)(xs.head, isort(less)(xs.tail))
    }

    def insert[T](less: (T, T) => Boolean)(x: T, xs: List[T]): List[T] = {
        if (xs.isEmpty || less(x, xs.head)) x :: xs
        else xs.head :: insert(less)(x, xs.tail)
    }

    val descendingOrder = isort((x: Int, y: Int) => x < y)(A)
    val ascendingOrder = isort((x: Int, y: Int) => x > y)(A)
    println(descendingOrder.mkString(" "))
    println(ascendingOrder.mkString(" "))
}

//サンプルコード
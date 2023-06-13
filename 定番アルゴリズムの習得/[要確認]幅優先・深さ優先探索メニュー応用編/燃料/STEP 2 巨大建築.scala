import scala.io.StdIn._

object Main extends App {
 
    val n = readLine().trim().toInt
    val recipe = Array.fill(n)(readLine().trim().split(" ").map(_.toInt))
    val price = recipe.map(_(0).toLong)
    val enable = recipe.map(_(1))
    val parts = Array.fill(n)(List.empty[Int])
    val minValue = price
    val confirm = Array.fill(n)(false)

    for (i <- 0 until n; j <- 0 until enable(i)) {
        parts(i) = recipe(i)(j + 2) - 1 :: parts(i)
    }

    @scala.annotation.tailrec
    def dfs(stack: List[Int]): Unit = {
        if (stack.nonEmpty) {
        val now = stack.head
        val rest = stack.tail

        if (!confirm(now)) {
            if (parts(now).isEmpty) {
            confirm(now) = true
            } else {
            val allConfirmed = parts(now).forall(next => confirm(next))
            if (allConfirmed) {
                val purchase = parts(now).map(next => minValue(next)).sum
                minValue(now) = purchase.min(price(now))
                confirm(now) = true
            }
            }
        }

        dfs(parts(now) ::: rest)
        }
    }

    dfs(parts(0))
    println(minValue(0))
}
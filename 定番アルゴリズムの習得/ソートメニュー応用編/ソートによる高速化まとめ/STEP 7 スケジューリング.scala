import scala.io.StdIn._

object Main extends App {

    val n = readLine().toInt
    val campaign = Array.ofDim[Int](n, 2)

    for (i <- 0 until n) {
        campaign(i) = readLine().split(" ").map(_.toInt)
    }

    val campaignSorted = campaign.sortBy(_(1))
    var participated = 0
    var lastday = 0

    for (i <- 0 until n) {
        if (lastday < campaignSorted(i)(0)) {
            participated = participated + 1
            lastday = campaignSorted(i)(1)
        }
    }

    println(participated)
}
//解答例使用済み
//断念
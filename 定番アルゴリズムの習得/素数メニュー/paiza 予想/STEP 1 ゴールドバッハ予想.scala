import scala.io.StdIn._
import math.abs

object Main extends App {

    val N = readLine().trim().toInt
    val isPrime = Array.fill(N+1)(true)

    def eratosthenes(N: Int) = {
        isPrime(0) = false
        isPrime(1) = false
        for (i <- 2 until N+1){
            if (isPrime(i)){
                for (j <- i*2 until N+1 by i){
                    isPrime(j) = false
                }
            }
        }
    }
    def findPrimes(N: Int): (Int, Int) = {
        var result = Array(1, 1, 2L)
        for (i <- 2 until N){
            val (p1, p2) = (i, abs(N-i))
            if (isPrime(p1) && isPrime(p2)){
                if (result(2) < p1.toLong*p2.toLong){
                    result = Array(p1, p2, p1.toLong*p2.toLong)
                }
            }
        }
        return (result(0).toInt, result(1).toInt)
    }
    eratosthenes(N)
    val (prime1, prime2) = findPrimes(N)
    println(prime1)
    println(prime2)
}
package lectures.part1basics

import scala.annotation.tailrec
import lectures.part1basics.Expressions.i

object Recursion extends App {
  def factorial(n: Int): Int =
    if (n <= 1) 1
    else n * factorial(n - 1)

  println(factorial(10))

  def anotherFactorial(n: Int): BigInt = {
    @tailrec
    def factHelper(x: Int, accumulator: BigInt): BigInt =
      if (x <= 1) accumulator
      else
        factHelper(
          x - 1,
          x * accumulator
        ) // TAIL RECURSION - use recursive call as the LAST exprssion

    factHelper(n, 1)
  }

  // 5println(anotherFactorial(5000))

  // WHEN YOU NEED LOOPS, USE _TAIL_ RECURSION

  def tailConcatenate(aString: String, n: Int): String = {
    @tailrec
    def concHelper(x: Int, accumulator: String): String =
      if (x <= 1) accumulator
      else concHelper(x - 1, accumulator + aString)

    concHelper(n, aString)
  }

  def fibonacci(n: Int): Int = {
    @tailrec
    def fiboHelper(x: Int, last: Int, nextToLast: Int): Int = 
        if (i >= n) last
        else fiboHelper(i + 1, last + nextToLast, last)

    if (n <= 2) 1
    else fiboHelper(2, 1, 1)
  }

  def isPrime(n: Int): Boolean = {
    @tailrec
    def isPrimeHelper(t: Int, accumulator: Boolean): Boolean = 
      if (!accumulator) false
      else if (t <= 1) true
      else isPrimeHelper(t - 1, n % t != 0 && accumulator)
    
    isPrimeHelper(n / 2, true)
  }

  println(tailConcatenate("testera", 3))

  println(isPrime(2003))
  println(isPrime(629))

  println(fibonacci(8))
}

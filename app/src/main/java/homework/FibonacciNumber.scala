package homework

import scala.annotation.tailrec

/**
 * https://leetcode.com/problems/fibonacci-number
 */
object FibonacciNumber {
  @tailrec
  def fib(n: Int, a: Int = 0, b: Int = 1): Int =
    n match
      case 0 => a
      case x => fib(n - 1, b, a + b)
}

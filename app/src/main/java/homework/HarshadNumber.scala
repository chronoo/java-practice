package homework

/**
 * https://leetcode.com/problems/harshad-number
 */
object HarshadNumber {
  def sumOfTheDigitsOfHarshadNumber(x: Int): Int =
    sumOfDigit(x) match
      case sum if x % sum == 0 => sum
      case _ => -1

  private def sumOfDigit(x: Int): Int =
    x match
      case num if num < 10 => num
      case _ => (x % 10) + sumOfDigit(x / 10)
}

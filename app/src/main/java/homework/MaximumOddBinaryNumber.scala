package homework

/**
 * https://leetcode.com/problems/maximum-odd-binary-number
 */
object MaximumOddBinaryNumber {
  def maximumOddBinaryNumber(s: String): String = {
    val wans = s.count(_ == '1')
    "1" * (wans - 1) + "0" * (s.length - wans) + "1"
  }
}

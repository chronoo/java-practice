package homework

/**
 * https://leetcode.com/problems/check-balanced-string
 */
object CheckBalancedString {
  def isBalanced(num: String): Boolean =
    num.toCharArray.zipWithIndex.map {
      (value, idx) => if (idx % 2 == 0) value.asNum else -value.asNum
    }.sum == 0

  implicit class CharNum(c: Char) {
    def asNum: Int = c - '0'
  }
}

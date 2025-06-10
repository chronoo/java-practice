package homework

/**
 * https://leetcode.com/problems/check-balanced-string
 */
object CheckBalancedString {
  def isBalanced(num: String): Boolean =
    num.zipWithIndex.filter((x, y) => y % 2 == 1).map((x, _) => x - '0').sum == num.zipWithIndex.filter((x, y) => y % 2 == 0).map((x, _) => x - '0').sum
}

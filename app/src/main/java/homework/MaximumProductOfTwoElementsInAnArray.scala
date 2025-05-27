package homework

/**
 * https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array
 */
object MaximumProductOfTwoElementsInAnArray {
  def maxProduct(nums: Array[Int]): Int =
    nums sortBy (-_) take 2 match
      case Array(first, second) => (first - 1) * (second - 1)
}

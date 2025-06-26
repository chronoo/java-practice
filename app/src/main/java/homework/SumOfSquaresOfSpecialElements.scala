package homework

/**
 * https://leetcode.com/problems/sum-of-squares-of-special-elements
 */
object SumOfSquaresOfSpecialElements {
  def sumOfSquares(nums: Array[Int]): Int =
    nums.zipWithIndex.filter((_, i) => nums.length % (i + 1) == 0).map((x, _) => x * x).sum
}

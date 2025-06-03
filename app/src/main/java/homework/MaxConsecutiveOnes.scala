package homework

/**
 * https://leetcode.com/problems/max-consecutive-ones
 */
object MaxConsecutiveOnes {
  def findMaxConsecutiveOnes(nums: Array[Int]): Int =
    nums.scanLeft (0) ((currCount, n) => if (n == 1) currCount + 1 else 0).max
}

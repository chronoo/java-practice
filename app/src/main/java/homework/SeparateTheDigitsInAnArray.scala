package homework

/**
 * https://leetcode.com/problems/separate-the-digits-in-an-array
 */
object SeparateTheDigitsInAnArray {
  def separateDigits(nums: Array[Int]): Array[Int] =
    nums.flatMap(x => x.toString.toCharArray).map(x => x - '0')
}

package homework

/**
 * https://leetcode.com/problems/find-the-integer-added-to-array-i
 */
object FindTheIntegerAddedToArrayI {
  def addedInteger(nums1: Array[Int], nums2: Array[Int]): Int =
    nums2.min - nums1.min
}

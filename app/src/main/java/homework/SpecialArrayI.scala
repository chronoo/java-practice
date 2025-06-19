package homework

/**
 * https://leetcode.com/problems/special-array-i
 */
object SpecialArrayI {
  def isArraySpecial(nums: Array[Int]): Boolean = 
    if nums.length == 1 then
      true
    else
      nums.sliding(2, 1).forall(a => a(0) % 2 != a(1) % 2)
}

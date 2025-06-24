package homework

/**
 * https://leetcode.com/problems/height-checker
 */
object HeightChecker {
  def heightChecker(heights: Array[Int]): Int = {
    val sorted = heights.sortBy(x => x)
    heights.zip(sorted).count((x, y) => x != y)
  }
}

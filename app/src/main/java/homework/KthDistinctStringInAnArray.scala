package homework

/**
 * https://leetcode.com/problems/kth-distinct-string-in-an-array
 */
object KthDistinctStringInAnArray {
  def kthDistinct(arr: Array[String], k: Int): String = {
    val values = arr.groupBy(identity).view.mapValues(_.length)
    val oneAppearance = arr.filter(values(_) == 1)
    if (k <= oneAppearance.length) oneAppearance(k - 1) else ""
  }
}

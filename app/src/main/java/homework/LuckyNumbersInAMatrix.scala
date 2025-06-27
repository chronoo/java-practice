package homework

/**
 * https://leetcode.com/problems/lucky-numbers-in-a-matrix
 */
object LuckyNumbersInAMatrix {
  def luckyNumbers(matrix: Array[Array[Int]]): List[Int] =
    matrix.map(_.min).intersect(matrix.transpose.map(_.max)).toList
}

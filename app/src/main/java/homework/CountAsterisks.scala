package homework

/**
 * https://leetcode.com/problems/count-asterisks
 */
object CountAsterisks {
  def countAsterisks(s: String): Int =
    s.split('|').zipWithIndex
      .filter(_._2 % 2 == 0)
      .map(_._1.count(x => x == '*'))
      .sum
}

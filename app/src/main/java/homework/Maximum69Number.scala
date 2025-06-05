package homework

/**
 * https://leetcode.com/problems/maximum-69-number
 */
object Maximum69Number {
  def maximum69Number(num: Int): Int = num.toString.replaceFirst("6", "9").toInt
}

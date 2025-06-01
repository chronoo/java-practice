package homework

/**
 * https://leetcode.com/problems/replace-all-digits-with-characters
 */
object ReplaceAllDigitsWithCharacters {
  def replaceDigits(s: String): String = replaceDigits(s.toList).mkString

  def replaceDigits(s: List[Char]): List[Char] =
    s match {
      case a if a.length <= 1 => a
      case a :: b :: c if a.isLetter && b.isDigit => List(a).appended((a + b - '0').toChar).appendedAll(replaceDigits(c))
      case head :: tail => replaceDigits(tail)
      case Nil => List()
    }
}

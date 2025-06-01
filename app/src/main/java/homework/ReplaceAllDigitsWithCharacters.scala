package homework

/**
 * https://leetcode.com/problems/replace-all-digits-with-characters
 */
object ReplaceAllDigitsWithCharacters {
  def replaceDigits(s: String): String = replaceDigits(s.toList).mkString

  def replaceDigits(s: List[Char]): List[Char] =
    s match {
      case Nil => List()
      case a :: Nil => List(a)
      case first :: second :: tail if first.isLetter && second.isDigit => List(first) :+ (first + second - '0').toChar appendedAll replaceDigits(tail)
      case head :: tail => replaceDigits(tail)
    }
}

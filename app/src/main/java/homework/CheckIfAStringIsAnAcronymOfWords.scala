package homework

/**
 * https://leetcode.com/problems/check-if-a-string-is-an-acronym-of-words
 */
object CheckIfAStringIsAnAcronymOfWords {
  def isAcronym(words: List[String], s: String): Boolean = {
    words.map(_(0)).mkString == s
  }
}

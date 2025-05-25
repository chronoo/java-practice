package homework

/**
 * https://leetcode.com/problems/unique-morse-code-words
 */
object UniqueMorseCodeWords {
  private val arr: Array[String] = Array(".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..")

  def uniqueMorseRepresentations(words: Array[String]): Int =
    (words map toMorse).distinct.length

  extension (str: String)
    private def toMorse: String = str.toCharArray.map(x => arr(x - 'a')).mkString
}

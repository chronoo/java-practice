package homework

/**
 * https://leetcode.com/problems/design-an-ordered-stream
 */
class OrderedStream(_n: Int) {
  val stream = Array.ofDim[String](_n + 1)
  var offset = 0

  def insert(id: Int, value: String): List[String] = {
    stream(id - 1) = value
    val lastCommit = stream.indexWhere(_ == null)
    val start = offset
    offset = lastCommit
    stream.slice(start, lastCommit).toList
  }
}
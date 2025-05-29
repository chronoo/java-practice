package homework

/**
 * https://leetcode.com/problems/find-closest-person
 */
object FindClosestPerson {
  def findClosest(x: Int, y: Int, z: Int): Int =
    (Math.abs(x - z), Math.abs(y - z)) match
      case (first, second) if first > second => 2
      case (first, second) if first < second => 1
      case _ => 0
}

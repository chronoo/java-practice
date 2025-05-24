package t

object CountSymmetricIntegers {
  def countSymmetricIntegers(low: Int, high: Int): Int =
    low to high count symmetric

  private def symmetric(x: Int): Boolean = {
    val str = x.toString.toCharArray
    if str.length % 2 == 1 then
      false
    else
      str.slice(0, str.length / 2).sum == str.slice(str.length / 2, str.length).sum
  }
}

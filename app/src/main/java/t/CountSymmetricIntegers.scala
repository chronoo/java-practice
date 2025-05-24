package t

object CountSymmetricIntegers {
  def countSymmetricIntegers(low: Int, high: Int): Int = {
    var i = 0
    var count = 0
    for
      i <- low to high
    do
      if valid(i) then
        count +=1
    count
  }

  private def valid(i: Int): Boolean = {
    val str = i.toString.toCharArray
    if str.length%2 == 1 then
      false
    else
      str.slice(0, str.length/2).sum == str.slice(str.length/2, str.length).sum
  }
}

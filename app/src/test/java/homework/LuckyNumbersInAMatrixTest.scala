package homework

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LuckyNumbersInAMatrixTest {
  @Test
  def test1(): Unit = {
    assertThat(LuckyNumbersInAMatrix.luckyNumbers(Array(
      Array(3,7,8),
      Array(9,11,13),
      Array(15,16,17),
    ))).isEqualTo(Array(15))
  }
  @Test
  def test2(): Unit = {
    assertThat(LuckyNumbersInAMatrix.luckyNumbers(Array(
      Array(1,10,4,2),
      Array(9,3,8,7),
      Array(15,16,17,12),
    ))).isEqualTo(Array(12))
  }
  @Test
  def test3(): Unit = {
    assertThat(LuckyNumbersInAMatrix.luckyNumbers(Array(
      Array(7,8),
      Array(1,2),
    ))).isEqualTo(Array(7))
  }
}

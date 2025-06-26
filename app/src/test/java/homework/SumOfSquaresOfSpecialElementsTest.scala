package homework

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SumOfSquaresOfSpecialElementsTest {
  @Test
  def test1(): Unit = {
    assertThat(SumOfSquaresOfSpecialElements.sumOfSquares(Array(1,2,3,4))).isEqualTo(21)
  }
  @Test
  def test2(): Unit = {
    assertThat(SumOfSquaresOfSpecialElements.sumOfSquares(Array(2,7,1,19,18,3))).isEqualTo(63)
  }
}

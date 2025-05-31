package homework

import homework.MaximumOddBinaryNumber.maximumOddBinaryNumber
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MaximumOddBinaryNumberTest {
  @Test
  def test1(): Unit = {
    assertThat(maximumOddBinaryNumber("010")).isEqualTo("001")
  }
  @Test
  def test2(): Unit = {
    assertThat(maximumOddBinaryNumber("0101")).isEqualTo("1001")
  }
}

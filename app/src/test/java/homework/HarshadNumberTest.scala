package homework

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class HarshadNumberTest {
  @Test
  def test1(): Unit = {
    assertThat(HarshadNumber.sumOfTheDigitsOfHarshadNumber(18)) isEqualTo 9
  }

  @Test
  def test2(): Unit = {
    assertThat(HarshadNumber.sumOfTheDigitsOfHarshadNumber(23)) isEqualTo -1
  }
}

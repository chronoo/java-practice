package homework

import homework.SeparateTheDigitsInAnArray.separateDigits
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SeparateTheDigitsInAnArrayTest {
  @Test
  def test1(): Unit = {
    assertThat(separateDigits(Array(13, 25, 83, 77))).isEqualTo(Array(1, 3, 2, 5, 8, 3, 7, 7))
  }

  @Test
  def test2(): Unit = {
    assertThat(separateDigits(Array(7, 1, 3, 9))).isEqualTo(Array(7, 1, 3, 9))
  }
}

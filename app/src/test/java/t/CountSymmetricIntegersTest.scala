package t

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CountSymmetricIntegersTest {
  @Test
  def test1(): Unit = {
    assertThat(CountSymmetricIntegers.countSymmetricIntegers(1, 100))
      .isEqualTo(9)
  }
  @Test
  def test2(): Unit = {
    assertThat(CountSymmetricIntegers.countSymmetricIntegers(1200, 1230))
      .isEqualTo(4)
  }
}
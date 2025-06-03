package homework

import homework.MaxConsecutiveOnes.findMaxConsecutiveOnes
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MaxConsecutiveOnesTest {
  @Test
  def test1(): Unit = {
    assertThat(findMaxConsecutiveOnes(
      Array(1,1,0,1,1,1)
    )).isEqualTo(3)
  }
  @Test
  def test2(): Unit = {
    assertThat(findMaxConsecutiveOnes(
      Array(1,0,1,1,0,1)
    )).isEqualTo(2)
  }
}

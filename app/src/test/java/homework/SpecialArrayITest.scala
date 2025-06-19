package homework

import homework.SpecialArrayI.isArraySpecial
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SpecialArrayITest {
  @Test
  def test1(): Unit = {
    assertThat(isArraySpecial(Array(1))).isTrue
  }
  @Test
  def test2(): Unit = {
    assertThat(isArraySpecial(Array(2,1,4))).isTrue
  }
  @Test
  def test3(): Unit = {
    assertThat(isArraySpecial(Array(4,3,1,6))).isFalse
  }
}

package homework

import homework.Maximum69Number.maximum69Number
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class Maximum69NumberTest {
  @Test
  def test1(): Unit = {
    assertThat(maximum69Number(9669)).isEqualTo(9969)
  }

  @Test
  def test2(): Unit = {
    assertThat(maximum69Number(9996)).isEqualTo(9999)
  }

  @Test
  def test3(): Unit = {
    assertThat(maximum69Number(9999)).isEqualTo(9999)
  }
}

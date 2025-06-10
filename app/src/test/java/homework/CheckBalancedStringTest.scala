package homework

import homework.CheckBalancedString.isBalanced
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CheckBalancedStringTest {
  @Test
  def test1(): Unit = {
    assertThat(isBalanced("1234")).isFalse
  }

  @Test
  def test2(): Unit = {
    assertThat(isBalanced("24123")).isTrue
  }
}

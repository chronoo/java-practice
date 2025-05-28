package homework

import homework.CountAsterisks.countAsterisks
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CountAsterisksTest {
  @Test
  def test1(): Unit = {
    assertThat(countAsterisks("l|*e*et|c**o|*de|")) isEqualTo 2
  }

  @Test
  def test2(): Unit = {
    assertThat(countAsterisks("iamprogrammer")) isEqualTo 0
  }

  @Test
  def test3(): Unit = {
    assertThat(countAsterisks("yo|uar|e**|b|e***au|tifu|l")) isEqualTo 5
  }
}

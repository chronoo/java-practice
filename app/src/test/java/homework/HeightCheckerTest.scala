package homework

import homework.HeightChecker.heightChecker
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class HeightCheckerTest {
  @Test
  def test1(): Unit = {
    assertThat(heightChecker(Array(1, 1, 4, 2, 1, 3))).isEqualTo(3)
  }

  @Test
  def test2(): Unit = {
    assertThat(heightChecker(Array(5, 1, 2, 3, 4))).isEqualTo(5)
  }

  @Test
  def test3(): Unit = {
    assertThat(heightChecker(Array(1, 2, 3, 4, 5))).isEqualTo(0)
  }
}

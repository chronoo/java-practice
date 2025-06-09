package homework

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class KthDistinctStringInAnArrayTest {
  @Test
  def test1(): Unit = {
    assertThat(KthDistinctStringInAnArray.kthDistinct(
      Array("d","b","c","b","c","a"), 2
    )).isEqualTo("a")
  }

  @Test
  def test2(): Unit = {
    assertThat(KthDistinctStringInAnArray.kthDistinct(
      Array("aaa","aa","a"), 1
    )).isEqualTo("aaa")
  }

  @Test
  def test3(): Unit = {
    assertThat(KthDistinctStringInAnArray.kthDistinct(
      Array("a","b","a"), 3
    )).isEqualTo("")
  }
}

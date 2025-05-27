package homework

import homework.MaximumProductOfTwoElementsInAnArray.maxProduct
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MaximumProductOfTwoElementsInAnArrayTest {
  @Test
  def test1(): Unit = {
    assertThat(maxProduct(Array(3, 4, 5, 2))) isEqualTo 12
  }

  @Test
  def test2(): Unit = {
    assertThat(maxProduct(Array(1, 5, 4, 5))) isEqualTo 16
  }

  @Test
  def test3(): Unit = {
    assertThat(maxProduct(Array(3, 7))) isEqualTo 12
  }
}

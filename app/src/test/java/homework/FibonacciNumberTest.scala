package homework

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FibonacciNumberTest {
  @Test
  def test1(): Unit = {
    assertThat(FibonacciNumber.fib(2)).isEqualTo(1)
  }

  @Test
  def test2(): Unit = {
    assertThat(FibonacciNumber.fib(3)).isEqualTo(2)
  }

  @Test
  def test3(): Unit = {
    assertThat(FibonacciNumber.fib(4)).isEqualTo(3)
  }
}

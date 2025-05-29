package homework

import homework.FindClosestPerson.findClosest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FindClosestPersonTest {
  @Test
  def test1(): Unit = assertThat(findClosest(2, 7, 4)) isEqualTo 1

  @Test
  def test2(): Unit = assertThat(findClosest(2, 5, 6)) isEqualTo 2

  @Test
  def test3(): Unit = assertThat(findClosest(1, 5, 3)) isEqualTo 0
}

package homework

import homework.UniqueMorseCodeWords.uniqueMorseRepresentations
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class UniqueMorseCodeWordsTest {
  @Test
  def test1(): Unit = {
    assertThat(uniqueMorseRepresentations(Array("gin", "zen", "gig", "msg"))) isEqualTo 2
  }

  @Test
  def test2(): Unit = {
    assertThat(uniqueMorseRepresentations(Array("a"))) isEqualTo 1
  }
}

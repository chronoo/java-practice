package homework

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CheckIfAStringIsAnAcronymOfWordsTest {
  @Test
  def test1(): Unit = {
    assertThat(CheckIfAStringIsAnAcronymOfWords.isAcronym(
      List("alice", "bob", "charlie"), "abc"
    )) isEqualTo true
  }

  @Test
  def test2(): Unit = {
    assertThat(CheckIfAStringIsAnAcronymOfWords.isAcronym(
      List("an", "apple"), "a"
    )) isEqualTo false
  }

  @Test
  def test3(): Unit = {
    assertThat(CheckIfAStringIsAnAcronymOfWords.isAcronym(
      List("never", "gonna", "give", "up", "on", "you"), "ngguoy"
    )) isEqualTo true
  }
}

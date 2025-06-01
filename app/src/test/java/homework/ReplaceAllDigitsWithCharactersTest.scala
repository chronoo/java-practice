package homework

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ReplaceAllDigitsWithCharactersTest {
  @Test
  def test1(): Unit = {
    assertThat(ReplaceAllDigitsWithCharacters.replaceDigits("a1c1e1"))
      .isEqualTo("abcdef")
  }
  @Test
  def test2(): Unit = {
    assertThat(ReplaceAllDigitsWithCharacters.replaceDigits("a1b2c3d4e"))
      .isEqualTo("abbdcfdhe")
  }
}

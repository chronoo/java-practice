package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class LongestSubstringWithoutRepeatingCharactersTest {

    private LongestSubstringWithoutRepeatingCharacters obj = new LongestSubstringWithoutRepeatingCharacters();

    @Test
    void test() {
        assertThat(obj.lengthOfLongestSubstring("abcabcbb")).isEqualTo(3);
    }
    @Test
    void test2() {
        assertThat(obj.lengthOfLongestSubstring("bbbbb")).isEqualTo(1);
    }
    @Test
    void test3() {
        assertThat(obj.lengthOfLongestSubstring("pwwkew")).isEqualTo(3);
    }
    @Test
    void test4() {
        assertThat(obj.lengthOfLongestSubstring("a")).isEqualTo(1);
    }
}
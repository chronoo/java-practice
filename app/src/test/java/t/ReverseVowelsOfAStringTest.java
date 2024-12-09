package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class ReverseVowelsOfAStringTest {
    ReverseVowelsOfAString obj = new ReverseVowelsOfAString();

    @Test
    void test1() {
        assertThat(obj.reverseVowels("IceCreAm")).isEqualTo("AceCreIm");
    }

    @Test
    void test2() {
        assertThat(obj.reverseVowels("leetcode")).isEqualTo("leotcede");
    }

    @Test
    void test3() {
        assertThat(obj.reverseVowels("aA")).isEqualTo("Aa");
    }

    @Test
    void test4() {
        assertThat(obj.reverseVowels(".,")).isEqualTo(".,");
    }
}
package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class LongestPalindromeTest {
    LongestPalindrome obj = new LongestPalindrome();

    @Test
    void test1() {
        assertThat(obj.longestPalindrome("abccccdd")).isEqualTo(7);
    }

    @Test
    void test2() {
        assertThat(obj.longestPalindrome("a")).isEqualTo(1);
    }

    @Test
    void test3() {
        assertThat(obj.longestPalindrome("AAAAAA")).isEqualTo(6);
    }
}
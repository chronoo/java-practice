package homework;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class LongestPalindromicSubstringTest {
    private final LongestPalindromicSubstring obj = new LongestPalindromicSubstring();

    @Test
    void test1() {
        assertThat(obj.longestPalindrome("babad")).isEqualTo("aba");
    }

    @Test
    void test2() {
        assertThat(obj.longestPalindrome("cbbd")).isEqualTo("bb");
    }

    @Test
    void test3() {
        assertThat(obj.isPalindrom(List.of('b', 'c'))).isFalse();
    }

    @Test
    void test6() {
        assertThat(obj.longestPalindrome("aa")).isEqualTo("aa");
    }

    @Test
    void test7() {
        assertThat(obj.isPalindrom(List.of('a', 'a'))).isTrue();
    }

    @Test
    void test4() {
        assertThat(obj.isPalindrom(List.of('a'))).isTrue();
    }


    @Test
    void test5() {
        assertThat(obj.longestPalindrome("ac")).isEqualTo("a");
    }
}
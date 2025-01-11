package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class ConstructKPalindromeStringsTest {
    ConstructKPalindromeStrings obj = new ConstructKPalindromeStrings();

    @Test
    void test1() {
        assertThat(obj.canConstruct("annabelle", 2)).isTrue();
    }

    @Test
    void test2() {
        assertThat(obj.canConstruct("leetcode", 3)).isFalse();
    }

    @Test
    void test3() {
        assertThat(obj.canConstruct("true", 4)).isTrue();
    }
}
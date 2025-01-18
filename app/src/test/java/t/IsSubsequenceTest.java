package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class IsSubsequenceTest {
    IsSubsequence obj = new IsSubsequence();

    @Test
    void test1() {
        assertThat(obj.isSubsequence("abc", "ahbgdc")).isTrue();
    }

    @Test
    void test2() {
        assertThat(obj.isSubsequence("axc", "ahbgdc")).isFalse();
    }

    @Test
    void test3() {
        assertThat(obj.isSubsequence("aaaaaa", "bbaaaa")).isFalse();
    }
}
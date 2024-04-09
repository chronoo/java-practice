package func;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class ValidPalindromeTest {

    private ValidPalindrome obj = new ValidPalindrome();

    @Test
    void test1() {
        assertThat(obj.isPalindrome("A man, a plan, a canal: Panama")).isEqualTo(true);
    }

    @Test
    void test2() {
        assertThat(obj.isPalindrome("race a car")).isEqualTo(false);
    }

    @Test
    void test3() {
        assertThat(obj.isPalindrome(" ")).isEqualTo(true);
    }
    @Test
    void test4() {
        assertThat(obj.isPalindrome("ab_a")).isEqualTo(true);
    }
}

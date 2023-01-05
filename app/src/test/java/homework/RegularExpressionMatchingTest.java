package homework;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RegularExpressionMatchingTest {

    private final RegularExpressionMatching obj = new RegularExpressionMatching();

    @Test
    void test1() {
        assertThat(obj.isMatch("aa", "a")).isFalse();
    }

    @Test
    void test2() {
        assertThat(obj.isMatch("aa", "a*")).isTrue();
    }


    @Test
    void test3() {
        assertThat(obj.isMatch("ab", ".*")).isTrue();
    }

}
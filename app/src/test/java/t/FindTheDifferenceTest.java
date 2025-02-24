package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class FindTheDifferenceTest {
    FindTheDifference obj = new FindTheDifference();

    @Test
    void test1() {
        assertThat(obj.findTheDifference("abcd", "abcde")).isEqualTo('e');
    }

    @Test
    void test2() {
        assertThat(obj.findTheDifference("", "y")).isEqualTo('y');
    }
}
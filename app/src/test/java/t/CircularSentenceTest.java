package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class CircularSentenceTest {
    CircularSentence obj = new CircularSentence();

    @Test
    void test1() {
        assertThat(obj.isCircularSentence("leetcode exercises sound delightful")).isTrue();
    }

    @Test
    void test2() {
        assertThat(obj.isCircularSentence("eetcode")).isTrue();
    }

    @Test
    void test3() {
        assertThat(obj.isCircularSentence("Leetcode is cool")).isFalse();
    }
}
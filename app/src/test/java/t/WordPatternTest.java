package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class WordPatternTest {
    WordPattern obj = new WordPattern();

    @Test
    void test1() {
        assertThat(obj.wordPattern("abba", "dog cat cat dog")).isTrue();
    }

    @Test
    void test2() {
        assertThat(obj.wordPattern("abba", "dog cat cat fish")).isFalse();
    }

    @Test
    void test3() {
        assertThat(obj.wordPattern("aaaa", "dog cat cat dog")).isFalse();
    }
}
package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class CheckIfAWordOccursAsAPrefixOfAnyWordInASentenceTest {
    CheckIfAWordOccursAsAPrefixOfAnyWordInASentence obj = new CheckIfAWordOccursAsAPrefixOfAnyWordInASentence();

    @Test
    void test1() {
        assertThat(obj.isPrefixOfWord("i love eating burger", "burg")).isEqualTo(4);
    }

    @Test
    void test2() {
        assertThat(obj.isPrefixOfWord("this problem is an easy problem", "pro")).isEqualTo(2);
    }

    @Test
    void test3() {
        assertThat(obj.isPrefixOfWord("i am tired", "you")).isEqualTo(-1);
    }

    @Test
    void test4() {
        assertThat(obj.isPrefixOfWord("love errichto jonathan dumb", "dumb")).isEqualTo(4);
    }
}
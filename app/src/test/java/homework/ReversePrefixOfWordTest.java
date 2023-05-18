package homework;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class ReversePrefixOfWordTest {

    private final ReversePrefixOfWord obj = new ReversePrefixOfWord();

    @Test
    void test1() {
        assertThat(obj.reversePrefix("abcdefd", 'd'))
            .isEqualTo("dcbaefd");
    }

    @Test
    void test2() {
        assertThat(obj.reversePrefix("xyxzxe", 'z'))
            .isEqualTo("zxyxxe");
    }

    @Test
    void test3() {
        assertThat(obj.reversePrefix("abcd", 'z'))
            .isEqualTo("abcd");
    }
}
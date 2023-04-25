package homework;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class LengthOfLastWordTest {

    private final LengthOfLastWord obj = new LengthOfLastWord();

    @Test
    void test1() {
        assertThat(obj.lengthOfLastWord("Hello World"))
            .isEqualTo(5);
    }

    @Test
    void test2() {
        assertThat(obj.lengthOfLastWord("   fly me   to   the moon  "))
            .isEqualTo(4);
    }

    @Test
    void test3() {
        assertThat(obj.lengthOfLastWord("luffy is still joyboy"))
            .isEqualTo(6);
    }
}
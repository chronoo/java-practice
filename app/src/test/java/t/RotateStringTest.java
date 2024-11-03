package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class RotateStringTest {
    RotateString obj = new RotateString();

    @Test
    void test1() {
        assertThat(obj.rotateString("abcde", "cdeab")).isTrue();
    }

    @Test
    void test2() {
        assertThat(obj.rotateString("abcde", "abced")).isFalse();
    }
}
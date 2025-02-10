package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class ClearDigitsTest {
    ClearDigits obj = new ClearDigits();

    @Test
    void test1() {
        assertThat(obj.clearDigits("abc")).isEqualTo("abc");
    }

    @Test
    void test2() {
        assertThat(obj.clearDigits("cb34")).isEqualTo("");
    }
}
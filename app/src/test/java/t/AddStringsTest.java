package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class AddStringsTest {
    AddStrings obj = new AddStrings();

    @Test
    void test1() {
        assertThat(obj.addStrings("11", "123")).isEqualTo("134");
    }

    @Test
    void test2() {
        assertThat(obj.addStrings("456", "77")).isEqualTo("533");
    }

    @Test
    void test3() {
        assertThat(obj.addStrings("0", "0")).isEqualTo("0");
    }
}
package homework;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class MultiplyStringsTest {
    private final MultiplyStrings obj = new MultiplyStrings();

    @Test
    void test1() {
        assertThat(obj.multiply("2", "3"))
            .isEqualTo("6");
    }

    @Test
    void test3() {
        assertThat(obj.multiply("4", "3"))
            .isEqualTo("12");
    }

    @Test
    void test2() {
        assertThat(obj.multiply("123", "456"))
            .isEqualTo("56088");
    }

    @Test
    void test4() {
        assertThat(obj.multiply("123456789", "987654321"))
            .isEqualTo("121932631112635269");
    }
}
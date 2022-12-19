package homework;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class ZigzagConversionTest {

    private final ZigzagConversion obj = new ZigzagConversion();

    @Test
    void test1() {
        assertThat(obj.convert("PAYPALISHIRING", 3))
                .isEqualTo("PAHNAPLSIIGYIR");
    }

    @Test
    void test2() {
        assertThat(obj.convert("PAYPALISHIRING", 4))
                .isEqualTo("PINALSIGYAHRPI");
    }


    @Test
    void test3() {
        assertThat(obj.convert("A", 1))
                .isEqualTo("A");
    }

    @Test
    void test4() {
        assertThat(obj.convert("AB", 2))
                .isEqualTo("AB");
    }
    @Test
    void test5() {
        assertThat(obj.convert("ABCDE", 4))
                .isEqualTo("ABCED");
    }
}
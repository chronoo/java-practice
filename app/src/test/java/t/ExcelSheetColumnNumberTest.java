package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class ExcelSheetColumnNumberTest {
    ExcelSheetColumnNumber obj = new ExcelSheetColumnNumber();

    @Test
    void test1() {
        assertThat(obj.titleToNumber("A")).isEqualTo(1);
    }

    @Test
    void test2() {
        assertThat(obj.titleToNumber("AB")).isEqualTo(28);
    }

    @Test
    void test3() {
        assertThat(obj.titleToNumber("ZY")).isEqualTo(701);
    }

    @Test
    void test4() {
        assertThat(obj.titleToNumber("FXSHRXW")).isEqualTo(2147483647);
    }

    @Test
    void test5() {
        assertThat(obj.titleToNumber("AAA")).isEqualTo(703);
    }
}
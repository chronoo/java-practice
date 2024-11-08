package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ExcelSheetColumnTitleTest {
    ExcelSheetColumnTitle obj = new ExcelSheetColumnTitle();

    @Test
    void test1() {
        assertThat(obj.convertToTitle(1)).isEqualTo("A");
    }

    @Test
    void test2() {
        assertThat(obj.convertToTitle(28)).isEqualTo("AB");
    }

    @Test
    void test3() {
        assertThat(obj.convertToTitle(701)).isEqualTo("ZY");
    }
}
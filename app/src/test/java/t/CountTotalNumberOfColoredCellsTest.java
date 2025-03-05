package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class CountTotalNumberOfColoredCellsTest {
    CountTotalNumberOfColoredCells obj = new CountTotalNumberOfColoredCells();

    @Test
    void test1() {
        assertThat(obj.coloredCells(1)).isEqualTo(1);
    }

    @Test
    void test2() {
        assertThat(obj.coloredCells(2)).isEqualTo(5);
    }
    @Test
    void test3() {
        assertThat(obj.coloredCells(3)).isEqualTo(13);
    }
}
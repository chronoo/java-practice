package t;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class CellsInARangeOnAnExcelSheetTest {
    CellsInARangeOnAnExcelSheet obj = new CellsInARangeOnAnExcelSheet();

    @Test
    void test1() {
        assertThat(obj.cellsInRange("K1:L2"))
            .isEqualTo(List.of("K1", "K2", "L1", "L2"));
    }

    @Test
    void test2() {
        assertThat(obj.cellsInRange("A1:F1"))
            .isEqualTo(List.of("A1", "B1", "C1", "D1", "E1", "F1"));
    }
}
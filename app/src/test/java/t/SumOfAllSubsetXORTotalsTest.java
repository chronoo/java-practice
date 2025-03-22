package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SumOfAllSubsetXORTotalsTest {
    SumOfAllSubsetXORTotals obj = new SumOfAllSubsetXORTotals();

    @Test
    void test1() {
        assertThat(obj.subsetXORSum(new int[]{
            1, 3
        })).isEqualTo(6);
    }

    @Test
    void test2() {
        assertThat(obj.subsetXORSum(new int[]{
            5, 1, 6
        })).isEqualTo(28);
    }

    @Test
    void test3() {
        assertThat(obj.subsetXORSum(new int[]{
            3, 4, 5, 6, 7, 8
        })).isEqualTo(480);
    }
}
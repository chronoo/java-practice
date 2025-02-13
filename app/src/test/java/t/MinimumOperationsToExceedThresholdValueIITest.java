package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class MinimumOperationsToExceedThresholdValueIITest {
    MinimumOperationsToExceedThresholdValueII obj = new MinimumOperationsToExceedThresholdValueII();

    @Test
    void test1() {
        assertThat(obj.minOperations(
            new int[]{2, 11, 10, 1, 3}, 10
        )).isEqualTo(2);
    }

    @Test
    void test2() {
        assertThat(obj.minOperations(
            new int[]{1, 1, 2, 4, 9}, 20
        )).isEqualTo(4);
    }

    @Test
    void test3() {
        assertThat(obj.minOperations(
            new int[]{999999999,999999999,999999999}, 1000000000
        )).isEqualTo(2);
    }
}
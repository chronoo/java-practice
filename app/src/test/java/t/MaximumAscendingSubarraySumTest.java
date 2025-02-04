package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class MaximumAscendingSubarraySumTest {
    MaximumAscendingSubarraySum obj = new MaximumAscendingSubarraySum();

    @Test
    void test1() {
        assertThat(obj.maxAscendingSum(new int[]{10, 20, 30, 5, 10, 50}))
                .isEqualTo(65);
    }

    @Test
    void test2() {
        assertThat(obj.maxAscendingSum(new int[]{10, 20, 30, 40, 50}))
                .isEqualTo(150);
    }

    @Test
    void test3() {
        assertThat(obj.maxAscendingSum(new int[]{12, 17, 15, 13, 10, 11, 12}))
                .isEqualTo(33);
    }
}
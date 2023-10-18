package homework;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaximumSubarrayTest {
    private final MaximumSubarray obj = new MaximumSubarray();

    @Test
    void test1() {
        assertThat(obj.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}))
            .isEqualTo(6);
    }

    @Test
    void test2() {
        assertThat(obj.maxSubArray(new int[]{1}))
            .isEqualTo(1);
    }

    @Test
    void test3() {
        assertThat(obj.maxSubArray(new int[]{5,4,-1,7,8}))
            .isEqualTo(23);
    }

    @Test
    void test4() {
        assertThat(obj.maxSubArray(new int[]{-2, -1}))
            .isEqualTo(-1);
    }
}

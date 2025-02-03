package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class LongestStrictlyIncreasingOrStrictlyDecreasingSubarrayTest {
    LongestStrictlyIncreasingOrStrictlyDecreasingSubarray obj = new LongestStrictlyIncreasingOrStrictlyDecreasingSubarray();

    @Test
    void test1() {
        assertThat(obj.longestMonotonicSubarray(new int[] {1,4,3,3,2})).isEqualTo(2);
    }

    @Test
    void test2() {
        assertThat(obj.longestMonotonicSubarray(new int[] {3,3,3,3})).isEqualTo(1);
    }

    @Test
    void test3() {
        assertThat(obj.longestMonotonicSubarray(new int[] {3,2,1})).isEqualTo(3);
    }
}
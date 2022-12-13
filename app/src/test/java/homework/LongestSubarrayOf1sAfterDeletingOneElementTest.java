package homework;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class LongestSubarrayOf1sAfterDeletingOneElementTest {
    private final LongestSubarrayOf1sAfterDeletingOneElement obj = new LongestSubarrayOf1sAfterDeletingOneElement();

    @Test
    void test1() {
        assertThat(obj.longestSubarray(new int[]{1,1,0,1}))
                .isEqualTo(3);
    }

    @Test
    void test2() {
        assertThat(obj.longestSubarray(new int[]{0,1,1,1,0,1,1,0,1}))
                .isEqualTo(5);
    }

    @Test
    void test3() {
        assertThat(obj.longestSubarray(new int[]{1,1,1}))
                .isEqualTo(2);
    }

    @Test
    void test4() {
        assertThat(obj.longestSubarray(new int[]{1,1,0,0,1,1,1,0,1}))
                .isEqualTo(4);
    }

    @Test
    void test5() {
        assertThat(obj.longestSubarray(new int[]{0,0,1,1}))
                .isEqualTo(2);
    }
}
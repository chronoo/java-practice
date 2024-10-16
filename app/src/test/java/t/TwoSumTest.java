package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class TwoSumTest {
    TwoSum obj = new TwoSum();

    @Test
    void test1() {
        assertThat(obj.twoSum(new int[]{2, 7, 11, 15}, 9)).isEqualTo(new int[]{0, 1});
    }

    @Test
    void test2() {
        assertThat(obj.twoSum(new int[]{3, 2, 4}, 6)).isEqualTo(new int[]{1, 2});
    }

    @Test
    void test3() {
        assertThat(obj.twoSum(new int[]{3, 3}, 6)).isEqualTo(new int[]{0, 1});
    }
}
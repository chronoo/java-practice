package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class LargestCombinationWithBitwiseANDGreaterThanZeroTest {
    LargestCombinationWithBitwiseANDGreaterThanZero obj = new LargestCombinationWithBitwiseANDGreaterThanZero();

    @Test
    void test1() {
        assertThat(obj.largestCombination(new int[]{16, 17, 71, 62, 12, 24, 14})).isEqualTo(4);
    }

    @Test
    void test2() {
        assertThat(obj.largestCombination(new int[]{8,8})).isEqualTo(2);
    }

    @Test
    void test3() {
        assertThat(obj.largestCombination(new int[]{33,93,31,99,74,37,3,4,2,94,77,10,75,54,24,95,65,100,41,82,35,65,38,49,85,72,67,21,20,31})).isEqualTo(18);
    }
}
package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class MinimumOperationsToMakeArrayValuesEqualToKTest {
    MinimumOperationsToMakeArrayValuesEqualToK obj = new MinimumOperationsToMakeArrayValuesEqualToK();

    @Test
    void test1() {
        assertThat(obj.minOperations(new int[]{5, 2, 5, 4, 5}, 2)).isEqualTo(2);
    }

    @Test
    void test2() {
        assertThat(obj.minOperations(new int[]{2, 1, 2}, 2)).isEqualTo(-1);
    }

    @Test
    void test3() {
        assertThat(obj.minOperations(new int[]{9, 7, 5, 3}, 1)).isEqualTo(4);
    }
}
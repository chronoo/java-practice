package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class MaxSumOfAPairWithEqualSumOfDigitsTest {
    MaxSumOfAPairWithEqualSumOfDigits obj = new MaxSumOfAPairWithEqualSumOfDigits();

    @Test
    void test1() {
        assertThat(obj.maximumSum(new int[]{18, 43, 36, 13, 7})).isEqualTo(54);
    }

    @Test
    void test2() {
        assertThat(obj.maximumSum(new int[]{10, 12, 19, 14})).isEqualTo(-1);
    }
}
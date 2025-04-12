package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SumOfVariableLengthSubarraysTest {
    SumOfVariableLengthSubarrays obj = new SumOfVariableLengthSubarrays();

    @Test
    void test1() {
        assertThat(obj.subarraySum(new int[]{2, 3, 1})).isEqualTo(11);
    }

    @Test
    void test2() {
        assertThat(obj.subarraySum(new int[]{3,1,1,2})).isEqualTo(13);
    }
}
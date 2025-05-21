package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SumOfAllOddLengthSubarraysTest {
    SumOfAllOddLengthSubarrays obj = new SumOfAllOddLengthSubarrays();

    @Test
    void test1() {
        assertThat(obj.sumOddLengthSubarrays(new int[]{
            1, 4, 2, 5, 3
        })).isEqualTo(58);
    }

    @Test
    void test2() {
        assertThat(obj.sumOddLengthSubarrays(new int[]{
            1, 2
        })).isEqualTo(3);
    }

    @Test
    void test3() {
        assertThat(obj.sumOddLengthSubarrays(new int[]{
            10, 11, 12
        })).isEqualTo(66);
    }
}
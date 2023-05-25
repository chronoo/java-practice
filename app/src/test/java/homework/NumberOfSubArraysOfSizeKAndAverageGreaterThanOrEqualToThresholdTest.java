package homework;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class NumberOfSubArraysOfSizeKAndAverageGreaterThanOrEqualToThresholdTest {

    private final NumberOfSubArraysOfSizeKAndAverageGreaterThanOrEqualToThreshold obj = new NumberOfSubArraysOfSizeKAndAverageGreaterThanOrEqualToThreshold();

    @Test
    void test1() {
        assertThat(obj.numOfSubarrays(new int[]{
            2, 2, 2, 2, 5, 5, 5, 8
        }, 3, 4)).isEqualTo(3);
    }

    @Test
    void test2() {
        assertThat(obj.numOfSubarrays(new int[]{
            11,13,17,23,29,31,7,5,2,3
        }, 3, 5)).isEqualTo(6);
    }
}
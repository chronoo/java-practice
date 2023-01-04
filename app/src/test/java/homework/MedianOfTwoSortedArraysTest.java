package homework;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class MedianOfTwoSortedArraysTest {

    private final MedianOfTwoSortedArrays obj = new MedianOfTwoSortedArrays();

    @Test
    void test1() {
        assertThat(obj.findMedianSortedArrays(
            new int[]{1,3},
            new int[] {2}
        )).isEqualTo(2.0);
    }

    @Test
    void test2() {
        assertThat(obj.findMedianSortedArrays(
            new int[]{1,2},
            new int[] {3,4}
        )).isEqualTo(2.5);
    }
}
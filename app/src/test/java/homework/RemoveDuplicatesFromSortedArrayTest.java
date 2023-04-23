package homework;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class RemoveDuplicatesFromSortedArrayTest {

    private final RemoveDuplicatesFromSortedArray obj = new RemoveDuplicatesFromSortedArray();

    @Test
    void test1() {
        int[] nums = {1, 1, 2};
        assertThat(obj.removeDuplicates(nums)).isEqualTo(2);
        assertThat(nums).isEqualTo(new int[]{1, 2});
    }

    @Test
    void test2() {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        assertThat(obj.removeDuplicates(nums)).isEqualTo(5);
        assertThat(nums).isEqualTo(new int[]{0,1,2,3,4});
    }
}
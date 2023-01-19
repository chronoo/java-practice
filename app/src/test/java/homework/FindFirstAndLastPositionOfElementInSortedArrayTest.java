package homework;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class FindFirstAndLastPositionOfElementInSortedArrayTest {

    private final FindFirstAndLastPositionOfElementInSortedArray obj = new FindFirstAndLastPositionOfElementInSortedArray();

    @Test
    void test1() {
        assertThat(obj.searchRange(new int[]{5,7,7,8,8,10}, 8))
                .isEqualTo(new int[]{3,4});
    }

    @Test
    void test2() {
        assertThat(obj.searchRange(new int[]{5,7,7,8,8,10}, 6))
                .isEqualTo(new int[]{-1,-1});
    }

    @Test
    void test3() {
        assertThat(obj.searchRange(new int[]{}, 0))
                .isEqualTo(new int[]{-1,-1});
    }
    @Test
    void test4() {
        assertThat(obj.searchRange(new int[]{1}, 1))
                .isEqualTo(new int[]{0,0});
    }
    @Test
    void test5() {
        assertThat(obj.searchRange(new int[]{1,3}, 1))
                .isEqualTo(new int[]{0,0});
    }
}
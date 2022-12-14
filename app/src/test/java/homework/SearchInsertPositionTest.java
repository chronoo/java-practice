package homework;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SearchInsertPositionTest {

    private final SearchInsertPosition obj = new SearchInsertPosition();

    @Test
    void test1() {
        assertThat(obj.searchInsert(new int[]{1,3,5,6}, 5))
                .isEqualTo(2);
    }

    @Test
    void test2() {
        assertThat(obj.searchInsert(new int[]{1,3,5,6}, 2))
                .isEqualTo(1);
    }

    @Test
    void test3() {
        assertThat(obj.searchInsert(new int[]{1,3,5,6}, 7))
                .isEqualTo(4);
    }

    @Test
    void test4() {
        assertThat(obj.searchInsert(new int[]{1,3,5,6}, 0))
                .isEqualTo(0);
    }

    @Test
    void test5() {
        assertThat(obj.searchInsert(new int[]{1,3,5,6}, 4))
                .isEqualTo(2);
    }
}
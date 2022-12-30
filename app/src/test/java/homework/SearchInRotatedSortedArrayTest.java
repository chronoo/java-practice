package homework;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SearchInRotatedSortedArrayTest {

    private final SearchInRotatedSortedArray obj = new SearchInRotatedSortedArray();

    @Test
    void test1() {
        assertThat(obj.search(new int[]{4,5,6,7,0,1,2}, 0))
            .isEqualTo(4);
    }

    @Test
    void test2() {
        assertThat(obj.search(new int[]{4,5,6,7,0,1,2}, 3))
            .isEqualTo(-1);
    }
    @Test
    void test3() {
        assertThat(obj.search(new int[]{1}, 0))
            .isEqualTo(-1);
    }
    @Test
    void test4() {
        assertThat(obj.search(new int[]{1,3,5}, 1))
            .isEqualTo(-1);
    }
    @Test
    void test5() {
        assertThat(obj.search(new int[]{1}, 1))
            .isEqualTo(0);
    }
}
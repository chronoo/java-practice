package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class BinarySearchTest {
    BinarySearch obj = new BinarySearch();

    @Test
    void test1() {
        assertThat(obj.search(
                new int[]{-1, 0, 3, 5, 9, 12},
                9
        )).isEqualTo(4);
    }

    @Test
    void test2() {
        assertThat(obj.search(
                new int[]{-1, 0, 3, 5, 9, 12},
                2
        )).isEqualTo(-1);
    }

    @Test
    void test3() {
        assertThat(obj.search(
                new int[]{-1,0,3,5,9,12},
                13
        )).isEqualTo(-1);
    }
}
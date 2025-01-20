package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class FirstCompletelyPaintedRowOrColumnTest {
    FirstCompletelyPaintedRowOrColumn obj = new FirstCompletelyPaintedRowOrColumn();

    @Test
    void test1() {
        assertThat(obj.firstCompleteIndex(
            new int[]{1, 3, 4, 2},
            new int[][]{{1, 4}, {2, 3}}
        )).isEqualTo(2);
    }

    @Test
    void test2() {
        assertThat(obj.firstCompleteIndex(
            new int[]{2, 8, 7, 4, 1, 3, 5, 6, 9},
            new int[][]{{3, 2, 5}, {1, 4, 6}, {8, 7, 9}}
        )).isEqualTo(3);
    }

    @Test
    void test3() {
        assertThat(obj.firstCompleteIndex(
            new int[]{6,2,3,1,4,5},
            new int[][]{{5,1}, {2,4}, {6,3}}
        )).isEqualTo(2);
    }
}
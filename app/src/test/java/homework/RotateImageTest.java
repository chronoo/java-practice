package homework;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class RotateImageTest {

    private final RotateImage obj = new RotateImage();

    @Test
    void test1() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        obj.rotate(matrix);
        int[][] res = {{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};
        assertThat(matrix)
            .isEqualTo(res);
    }

    @Test
    void test2() {
        int[][] matrix = {{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}};
        obj.rotate(matrix);
        int[][] res = {{15, 13, 2, 5}, {14, 3, 4, 1}, {12, 6, 8, 9}, {16, 7, 10, 11}};
        assertThat(matrix)
            .isEqualTo(res);
    }


    @Test
    void test3() {
        int[][] matrix = {{1,2},{3,4}};
        obj.rotate(matrix);
        int[][] res = {{3,1},{4,2}};
        assertThat(matrix)
            .isEqualTo(res);
    }
    @Test
    void test4() {
        int[][] matrix = {{1,2,3,4,5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}};
        obj.rotate(matrix);
        int[][] res = {{21, 16, 11, 6, 1}, {22, 17, 12, 7, 2}, {23, 18, 13, 8, 3}, {24, 19, 14, 9, 4}, {25, 20, 15, 10, 5}};
        assertThat(matrix)
            .isEqualTo(res);
    }
}
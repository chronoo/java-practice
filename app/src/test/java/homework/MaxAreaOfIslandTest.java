package homework;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class MaxAreaOfIslandTest {
    private final MaxAreaOfIsland obj = new MaxAreaOfIsland();

    @Test
    void test1() {
        assertThat(obj.maxAreaOfIsland(new int[][]{
            {0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
            {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
            {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}}
        )).isEqualTo(6);
    }

    @Test
    void test2() {
        assertThat(obj.maxAreaOfIsland(new int[][]{
            {0, 0, 0, 0, 0, 0, 0, 0}
        })).isZero();
    }
}
package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class IslandPerimeterTest {
    IslandPerimeter obj = new IslandPerimeter();

    @Test
    void test1() {
        assertThat(obj.islandPerimeter(new int[][]{
            {0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}
        })).isEqualTo(16);
    }

    @Test
    void test2() {
        assertThat(obj.islandPerimeter(new int[][]{
            {1}
        })).isEqualTo(4);
    }

    @Test
    void test3() {
        assertThat(obj.islandPerimeter(new int[][]{
            {1, 0}
        })).isEqualTo(4);
    }
}
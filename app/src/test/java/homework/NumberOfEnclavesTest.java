package homework;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class NumberOfEnclavesTest {
    private final NumberOfEnclaves obj = new NumberOfEnclaves();

    @Test
    void test1() {
        assertThat(obj.numEnclaves(new int[][]{
            {0,0,0,0},{1,0,1,0},{0,1,1,0},{0,0,0,0}
        })).isEqualTo(3);
    }

    @Test
    void test2() {
        assertThat(obj.numEnclaves(new int[][]{
            {0,1,1,0},{0,0,1,0},{0,0,1,0},{0,0,0,0}
        })).isZero();
    }
    @Test
    void test3() {
        assertThat(obj.numEnclaves(new int[][]{
            {0,0,0,1,1,1,0,1,0,0},
            {1,1,0,0,0,1,0,1,1,1},
            {0,0,0,1,1,1,0,1,0,0},
            {0,1,1,0,0,0,1,0,1,0},
            {0,1,1,1,1,1,0,0,1,0},
            {0,0,1,0,1,1,1,1,0,1},
            {0,1,1,0,0,0,1,1,1,1},
            {0,0,1,0,0,1,0,1,0,1},
            {1,0,1,0,1,1,0,0,0,0},
            {0,0,0,0,1,1,0,0,0,1}
        })).isEqualTo(3);
    }

    @Test
    void test4() {
        assertThat(obj.numEnclaves(new int[][]{
            {0,1,1,0,0,0,0,1,1,0,0,0},
            {1,0,1,1,1,0,1,0,1,1,1,0},
            {1,1,0,1,0,0,1,1,0,1,1,1},
            {1,0,0,1,1,0,1,0,1,0,1,0},
            {1,0,0,0,0,1,0,0,1,1,0,1},
            {1,1,1,0,0,0,1,0,0,1,1,1},
            {1,1,1,0,0,0,0,1,0,1,0,1},
            {0,1,1,1,1,0,0,1,1,0,0,0},
            {0,1,0,1,0,1,0,1,0,0,0,1},
            {0,0,1,0,1,1,0,0,0,1,1,1}
        })).isEqualTo(10);
    }
}
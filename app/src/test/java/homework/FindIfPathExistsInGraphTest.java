package homework;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class FindIfPathExistsInGraphTest {
    private final FindIfPathExistsInGraph obj = new FindIfPathExistsInGraph();

    @Test
    void test1() {
        assertThat(obj.validPath(3, new int[][]{
            {0,1},{1,2},{2,0}
        },0,2)).isTrue();
    }

    @Test
    void test2() {
        assertThat(obj.validPath(6, new int[][]{
            {0,1},{0,2},{3,5},{5,4},{4,3}
        },0,5)).isFalse();
    }
}
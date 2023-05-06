package homework;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class CountSubIslandsTest {

    private final CountSubIslands obj = new CountSubIslands();

    @Test
    void test1() {
        assertThat(obj.countSubIslands(new int[][]{
            {1,1,1,0,0},{0,1,1,1,1},{0,0,0,0,0},{1,0,0,0,0},{1,1,0,1,1}
        }, new int[][]{
            {1,1,1,0,0},{0,0,1,1,1},{0,1,0,0,0},{1,0,1,1,0},{0,1,0,1,0}
        })).isEqualTo(3);
    }
    @Test
    void test2() {
        assertThat(obj.countSubIslands(new int[][]{
            {1,0,1,0,1},{1,1,1,1,1},{0,0,0,0,0},{1,1,1,1,1},{1,0,1,0,1}
        }, new int[][]{
            {0,0,0,0,0},{1,1,1,1,1},{0,1,0,1,0},{0,1,0,1,0},{1,0,0,0,1}
        })).isEqualTo(2);
    }
}
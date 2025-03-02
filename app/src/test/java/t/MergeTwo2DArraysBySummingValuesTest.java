package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class MergeTwo2DArraysBySummingValuesTest {
    MergeTwo2DArraysBySummingValues obj = new MergeTwo2DArraysBySummingValues();

    @Test
    void test1() {
        assertThat(obj.mergeArrays(new int[][]{
                {1, 2}, {2, 3}, {4, 5}
        }, new int[][]{
                {1, 4}, {3, 2}, {4, 1}
        })).isEqualTo(new int[][]{
                {1, 6}, {2, 3}, {3, 2}, {4, 6}
        });
    }

    @Test
    void test2() {
        assertThat(obj.mergeArrays(new int[][]{
                {2, 4}, {3, 6}, {5, 5}
        }, new int[][]{
                {1, 3}, {4, 3}
        })).isEqualTo(new int[][]{
                {1, 3}, {2, 4}, {3, 6}, {4, 3}, {5, 5}
        });
    }
}
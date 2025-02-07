package t;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class FindTheNumberOfDistinctColorsAmongTheBallsTest {
    FindTheNumberOfDistinctColorsAmongTheBalls obj = new FindTheNumberOfDistinctColorsAmongTheBalls();

    @Test
    void test1() {
        assertThat(obj.queryResults(4, new int[][]{
                {1, 4}, {2, 5}, {1, 3}, {3, 4}
        })).isEqualTo(new int[]{1, 2, 2, 3});
    }

    @Test
    void test2() {
        assertThat(obj.queryResults(4, new int[][]{
                {0, 1}, {1, 2}, {2, 2}, {3, 4}, {4, 5}
        })).isEqualTo(new int[]{1, 2, 2, 3, 4});
    }
}
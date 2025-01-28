package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class FindCenterOfStarGraphTest {
    FindCenterOfStarGraph obj = new FindCenterOfStarGraph();

    @Test
    void test1() {
        assertThat(obj.findCenter(new int[][]{{1, 2}, {2, 3}, {4, 2}})).isEqualTo(2);
    }
}
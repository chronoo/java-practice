package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class WidestVerticalAreaBetweenTwoPointsContainingNoPointsTest {
    WidestVerticalAreaBetweenTwoPointsContainingNoPoints obj = new WidestVerticalAreaBetweenTwoPointsContainingNoPoints();

    @Test
    void test1() {
        assertThat(obj.maxWidthOfVerticalArea(new int[][]{{8, 7}, {9, 9}, {7, 4}, {9, 7}})).isEqualTo(1);
    }

    @Test
    void test2() {
        assertThat(obj.maxWidthOfVerticalArea(new int[][]{{3, 1}, {9, 0}, {1, 0}, {1, 4}, {5, 3}, {8, 8}})).isEqualTo(3);
    }
}
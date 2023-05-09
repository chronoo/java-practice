package homework;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class MinCostToConnectAllPointsTest {

    private final MinCostToConnectAllPoints obj = new MinCostToConnectAllPoints();

    @Test
    void test1() {
        assertThat(obj.minCostConnectPoints(new int[][]{
            {0,0},{2,2},{3,10},{5,2},{7,0}
        })).isEqualTo(20);
    }

    @Test
    void test2() {
        assertThat(obj.minCostConnectPoints(new int[][]{
            {3,12},{-2,5},{-4,1}
        })).isEqualTo(18);
    }
    @Test
    void test3() {
        assertThat(obj.minCostConnectPoints(new int[][]{
            {-1000000,-1000000},{1000000,1000000}
        })).isEqualTo(4000000);
    }
}
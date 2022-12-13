package homework;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class MergeIntervalsTest {
    private final MergeIntervals obj = new MergeIntervals();

    @Test
    void test1() {
        assertThat(obj.merge(
                new int[][]{
                        {1, 3},
                        {2, 6},
                        {8, 10},
                        {15, 18}
                }
        )).isEqualTo(new int[][]{
                {1, 6},
                {8, 10},
                {15, 18}
        });
    }

    @Test
    void test2() {
        assertThat(obj.merge(
                new int[][]{
                        {1, 4},
                        {4,5}
                }
        )).isEqualTo(new int[][]{
                {1, 5}
        });
    }

    @Test
    void test3() {
        assertThat(obj.merge(
                new int[][]{
                        {1, 4},
                        {2,3}
                }
        )).isEqualTo(new int[][]{
                {1, 4}
        });
    }
}
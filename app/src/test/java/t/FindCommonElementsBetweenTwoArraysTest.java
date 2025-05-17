package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class FindCommonElementsBetweenTwoArraysTest {
    FindCommonElementsBetweenTwoArrays obj = new FindCommonElementsBetweenTwoArrays();

    @Test
    void test1() {
        assertThat(obj.findIntersectionValues(new int[]{
                2, 3, 2
        }, new int[]{
                1, 2
        })).isEqualTo(new int[]{
                2, 1
        });
    }

    @Test
    void test2() {
        assertThat(obj.findIntersectionValues(new int[]{
                4, 3, 2, 3, 1
        }, new int[]{
                2, 2, 5, 2, 3, 6
        })).isEqualTo(new int[]{
                3, 4
        });
    }

    @Test
    void test3() {
        assertThat(obj.findIntersectionValues(new int[]{
                3, 4, 2, 3
        }, new int[]{
                1, 5
        })).isEqualTo(new int[]{
                0, 0
        });
    }
}
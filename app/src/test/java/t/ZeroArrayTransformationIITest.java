package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class ZeroArrayTransformationIITest {
    ZeroArrayTransformationII obj = new ZeroArrayTransformationII();

    @Test
    void test1() {
        assertThat(obj.minZeroArray(new int[]{
                2, 0, 2
        }, new int[][]{
                {0, 2, 1}, {0, 2, 1}, {1, 1, 3}
        })).isEqualTo(2);
    }

    @Test
    void test2() {
        assertThat(obj.minZeroArray(new int[]{
                4, 3, 2, 1
        }, new int[][]{
                {1, 3, 2}, {0, 2, 1}
        })).isEqualTo(-1);
    }
}
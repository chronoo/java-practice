package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class TransformArrayByParityTest {
    TransformArrayByParity obj = new TransformArrayByParity();

    @Test
    void test1() {
        assertThat(obj.transformArray(new int[]{4, 3, 2, 1}))
            .isEqualTo(new int[]{0, 0, 1, 1});
    }

    @Test
    void test2() {
        assertThat(obj.transformArray(new int[]{1, 5, 1, 4, 2}))
            .isEqualTo(new int[]{0, 0, 1, 1, 1});
    }
}
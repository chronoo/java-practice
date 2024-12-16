package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class FinalArrayStateAfterKMultiplicationOperationsITest {
    FinalArrayStateAfterKMultiplicationOperationsI obj = new FinalArrayStateAfterKMultiplicationOperationsI();

    @Test
    void test1() {
        assertThat(obj.getFinalState(new int[]{2, 1, 3, 5, 6}, 5, 2))
            .isEqualTo(new int[]{8,4,6,5,6});
    }

    @Test
    void test2() {
        assertThat(obj.getFinalState(new int[]{1, 2}, 3, 4))
            .isEqualTo(new int[]{16, 8});
    }
}
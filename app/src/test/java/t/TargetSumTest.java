package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class TargetSumTest {
    TargetSum obj = new TargetSum();

    @Test
    void test1() {
        assertThat(obj.findTargetSumWays(new int[]{1, 1, 1, 1, 1}, 3))
            .isEqualTo(5);
    }

    @Test
    void test2() {
        assertThat(obj.findTargetSumWays(new int[]{1}, 1))
            .isEqualTo(1);
    }
}
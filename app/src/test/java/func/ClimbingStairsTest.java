package func;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class ClimbingStairsTest {
    ClimbingStairs obj = new ClimbingStairs();

    @Test
    void test1() {
        assertThat(obj.climbStairs(2)).isEqualTo(2);
    }

    @Test
    void test2() {
        assertThat(obj.climbStairs(3)).isEqualTo(3);
    }

    @Test
    void test4() {
        assertThat(obj.climbStairs(45)).isEqualTo(1836311903);
    }

}

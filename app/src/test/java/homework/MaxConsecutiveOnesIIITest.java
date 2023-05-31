package homework;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class MaxConsecutiveOnesIIITest {
    private final MaxConsecutiveOnesIII obj = new MaxConsecutiveOnesIII();

    @Test
    void test1() {
        assertThat(obj.longestOnes(new int[]{
            1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0
        }, 2)).isEqualTo(6);
    }

    @Test
    void test2() {
        assertThat(obj.longestOnes(new int[]{
            0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1
        }, 3)).isEqualTo(10);
    }

    @Test
    void test3() {
        assertThat(obj.longestOnes(new int[]{
            0, 0, 0, 1
        }, 4)).isEqualTo(4);
    }

    @Test
    void test4() {
        assertThat(obj.longestOnes(new int[]{
            1, 1, 1, 0, 0, 0, 1, 1, 1, 1
        }, 0)).isEqualTo(4);
    }

    @Test
    void test5() {
        assertThat(obj.longestOnes(new int[]{
            0, 0, 1, 1, 1, 0, 0
        }, 0)).isEqualTo(3);
    }
}
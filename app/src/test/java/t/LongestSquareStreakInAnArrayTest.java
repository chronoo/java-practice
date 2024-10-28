package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class LongestSquareStreakInAnArrayTest {
    LongestSquareStreakInAnArray obj = new LongestSquareStreakInAnArray();

    @Test
    void test1() {
        assertThat(obj.longestSquareStreak(new int[]{4, 3, 6, 16, 8, 2}))
                .isEqualTo(3);
    }

    @Test
    void test2() {
        assertThat(obj.longestSquareStreak(new int[]{2, 3, 5, 6, 7}))
                .isEqualTo(-1);
    }
}
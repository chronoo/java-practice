package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class MaximumScoreAfterSplittingAStringTest {
    MaximumScoreAfterSplittingAString obj = new MaximumScoreAfterSplittingAString();

    @Test
    void test1() {
        assertThat(obj.maxScore("011101")).isEqualTo(5);
    }

    @Test
    void test2() {
        assertThat(obj.maxScore("00111")).isEqualTo(5);
    }

    @Test
    void test3() {
        assertThat(obj.maxScore("1111")).isEqualTo(3);
    }
}
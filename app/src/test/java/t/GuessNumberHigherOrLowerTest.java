package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class GuessNumberHigherOrLowerTest {
    @Test
    void test1() {
        assertThat(new GuessNumberHigherOrLower(6).guessNumber(10)).isEqualTo(6);
    }

    @Test
    void test2() {
        assertThat(new GuessNumberHigherOrLower(1).guessNumber(1)).isEqualTo(1);
    }

    @Test
    void test3() {
        assertThat(new GuessNumberHigherOrLower(1).guessNumber(2)).isEqualTo(1);
    }

    @Test
    void test4() {
        assertThat(new GuessNumberHigherOrLower(2).guessNumber(2)).isEqualTo(2);
    }
    @Test
    void test5() {
        assertThat(new GuessNumberHigherOrLower(1).guessNumber(3)).isEqualTo(1);
    }
}
package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class CheckIfNumberIsASumOfPowersOfThreeTest {
    CheckIfNumberIsASumOfPowersOfThree obj = new CheckIfNumberIsASumOfPowersOfThree();

    @Test
    void test1() {
        assertThat(obj.checkPowersOfThree(12)).isTrue();
    }

    @Test
    void test2() {
        assertThat(obj.checkPowersOfThree(91)).isTrue();
    }

    @Test
    void test3() {
        assertThat(obj.checkPowersOfThree(21)).isFalse();
    }
}
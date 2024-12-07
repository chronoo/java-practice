package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class PowerOfFourTest {
    PowerOfFour obj = new PowerOfFour();

    @Test
    void test1() {
        assertThat(obj.isPowerOfFour(1)).isTrue();
    }

    @Test
    void test2() {
        assertThat(obj.isPowerOfFour(5)).isFalse();
    }

    @Test
    void test3() {
        assertThat(obj.isPowerOfFour(16)).isTrue();
    }
}
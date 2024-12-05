package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class PowerOfThreeTest {
    PowerOfThree obj = new PowerOfThree();

    @Test
    void test1() {
        assertThat(obj.isPowerOfThree(27)).isTrue();
    }

    @Test
    void test2() {
        assertThat(obj.isPowerOfThree(0)).isFalse();
    }

    @Test
    void test3() {
        assertThat(obj.isPowerOfThree(-1)).isFalse();
    }
}
package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class PowerOfTwoTest {
    PowerOfTwo obj = new PowerOfTwo();

    @Test
    void test1() {
        assertThat(obj.isPowerOfTwo(1)).isTrue();
    }

    @Test
    void test2() {
        assertThat(obj.isPowerOfTwo(16)).isTrue();
    }

    @Test
    void test3() {
        assertThat(obj.isPowerOfTwo(3)).isFalse();
    }
}
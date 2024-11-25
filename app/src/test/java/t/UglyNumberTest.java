package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class UglyNumberTest {
    @Test
    void test1() {
        UglyNumber obj = new UglyNumber();
        assertThat(obj.isUgly(6)).isTrue();
    }

    @Test
    void test2() {
        UglyNumber obj = new UglyNumber();
        assertThat(obj.isUgly(1)).isTrue();
    }

    @Test
    void test3() {
        UglyNumber obj = new UglyNumber();
        assertThat(obj.isUgly(14)).isFalse();
    }
}
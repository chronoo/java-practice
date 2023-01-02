package homework;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class DivideTwoIntegersTest {

    private final DivideTwoIntegers obj = new DivideTwoIntegers();

    @Test
    void test1() {
        assertThat(obj.divide(10, 3)).isEqualTo(3);
    }

    @Test
    void test2() {
        assertThat(obj.divide(7, -3)).isEqualTo(-2);
    }
    @Test
    void test3() {
        assertThat(obj.divide(-2147483648, -1)).isEqualTo(2147483647);
    }
    @Test
    void test4() {
        assertThat(obj.divide(2147483647, 1)).isEqualTo(2147483647);
    }

    @Test
    void test5() {
        assertThat(obj.divide(2147483647, 2)).isEqualTo(1073741823);
    }

    @Test
    void test6() {
        assertThat(obj.divide(100, 5)).isEqualTo(20);
    }
    @Test
    void test7() {
        assertThat(obj.divide(-1, 1)).isEqualTo(-1);
    }
    @Test
    void test8() {
        assertThat(obj.divide(-2147483648, 2)).isEqualTo(-1073741824);
    }
}
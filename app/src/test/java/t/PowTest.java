package t;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class PowTest {

    private final Pow obj = new Pow();

    @Test
    void test1() {
        assertThat(obj.myPow(2.00000, 10)).isEqualTo(1024.00000);
    }
    @Test
    void test2() {
        assertThat(obj.myPow(2.10000, 3)).isCloseTo(9.26100, Assertions.offset(0.0001));
    }
    @Test
    void test3() {
        assertThat(obj.myPow(2.00000, -2)).isEqualTo(0.25000);
    }
    @Test
    void test4() {
        assertThat(obj.myPow(2.00000, -2147483648)).isEqualTo(0.0000);
    }
    @Test
    void test5() {
        assertThat(obj.myPow(-1.00000, 2147483647)).isEqualTo(-1.0000);
    }
}
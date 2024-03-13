package func;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SqrtTest {
    Sqrt obj = new Sqrt();

    @Test
    void test1() {
        assertThat(obj.mySqrt(4))
                .isEqualTo(2);
    }

    @Test
    void test2() {
        assertThat(obj.mySqrt(8))
                .isEqualTo(2);
    }
    @Test
    void test3() {
        assertThat(obj.mySqrt(1))
                .isEqualTo(1);
    }
    @Test
    void test4() {
        assertThat(obj.mySqrt(144))
                .isEqualTo(12);
    }
    @Test
    void test5() {
        assertThat(obj.mySqrt(2147395599))
                .isEqualTo(46339);
    }
}

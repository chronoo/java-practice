package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class CountTheDigitsThatDivideANumberTest {
    CountTheDigitsThatDivideANumber obj = new CountTheDigitsThatDivideANumber();

    @Test
    void test1() {
        assertThat(obj.countDigits(7)).isEqualTo(1);
    }

    @Test
    void test2() {
        assertThat(obj.countDigits(121)).isEqualTo(2);
    }

    @Test
    void test3() {
        assertThat(obj.countDigits(1248)).isEqualTo(4);
    }
}
package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class CountSubstringsThatSatisfyKConstraintITest {
    CountSubstringsThatSatisfyKConstraintI obj = new CountSubstringsThatSatisfyKConstraintI();

    @Test
    void test1() {
        assertThat(obj.countKConstraintSubstrings("10101", 1)).isEqualTo(12);
    }

    @Test
    void test2() {
        assertThat(obj.countKConstraintSubstrings("1010101", 2)).isEqualTo(25);
    }

    @Test
    void test3() {
        assertThat(obj.countKConstraintSubstrings("11111", 1)).isEqualTo(15);
    }
}
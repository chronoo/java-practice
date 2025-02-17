package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class TheTwoSneakyNumbersOfDigitvilleTest {
    TheTwoSneakyNumbersOfDigitville obj = new TheTwoSneakyNumbersOfDigitville();

    @Test
    void test1() {
        assertThat(obj.getSneakyNumbers(new int[]{0, 1, 1, 0})).isEqualTo(new int[]{0, 1});
    }

    @Test
    void test2() {
        assertThat(obj.getSneakyNumbers(new int[]{0, 3, 2, 1, 3, 2})).isEqualTo(new int[]{2, 3});
    }

    @Test
    void test3() {
        assertThat(obj.getSneakyNumbers(new int[]{7, 1, 5, 4, 3, 4, 6, 0, 9, 5, 8, 2})).isEqualTo(new int[]{4, 5});
    }
}
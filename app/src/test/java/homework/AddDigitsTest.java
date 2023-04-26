package homework;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class AddDigitsTest {

    private final AddDigits obj = new AddDigits();

    @Test
    void test1() {
        assertThat(obj.addDigits(38)).isEqualTo(2);
    }
    @Test
    void test2() {
        assertThat(obj.addDigits(0)).isEqualTo(0);
    }
    @Test
    void test3() {
        assertThat(obj.addDigits(36)).isEqualTo(9);
    }
    @Test
    void test4() {
        assertThat(obj.addDigits(9)).isEqualTo(9);
    }
    @Test
    void test5() {
        assertThat(obj.addDigits(10)).isEqualTo(1);
    }
}
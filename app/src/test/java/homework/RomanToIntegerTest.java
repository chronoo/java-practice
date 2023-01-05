package homework;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RomanToIntegerTest {

    private final RomanToInteger obj = new RomanToInteger();

    @Test
    void test1() {
        assertThat(obj.romanToInt("III")).isEqualTo(3);
    }

    @Test
    void test2() {
        assertThat(obj.romanToInt("LVIII")).isEqualTo(58);
    }

    @Test
    void test3() {
        assertThat(obj.romanToInt("MCMXCIV")).isEqualTo(1994);
    }
}
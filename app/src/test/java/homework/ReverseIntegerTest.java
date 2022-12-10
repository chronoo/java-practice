package homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ReverseIntegerTest {
    private final ReverseInteger rever = new ReverseInteger();

    @Test
    void test1() {
        Assertions.assertEquals(321, rever.reverse(123));
    }


    @Test
    void test2() {
        Assertions.assertEquals(-321, rever.reverse(-123));
    }

    @Test
    void test3() {
        Assertions.assertEquals(21, rever.reverse(120));
    }
}
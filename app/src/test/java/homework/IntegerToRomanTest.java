package homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegerToRomanTest {
    @Test
    public void test1() {
        assertEquals("III", new IntegerToRoman().intToRoman(3));
    }

    @Test
    public void test2() {
        assertEquals("LVIII", new IntegerToRoman().intToRoman(58));
    }

    @Test
    public void test3() {
        assertEquals("MCMXCIV", new IntegerToRoman().intToRoman(1994));
    }

    @Test
    public void test4() {
        assertEquals("XXVII", new IntegerToRoman().intToRoman(27));
    }
}
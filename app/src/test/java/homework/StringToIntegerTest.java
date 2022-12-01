package homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StringToIntegerTest {
    @Test
    public void test1() {
        Assertions.assertEquals(42, new StringToInteger().myAtoi("42"));
    }

    @Test
    public void test2() {
        Assertions.assertEquals(-42, new StringToInteger().myAtoi("   -42"));
    }

    @Test
    public void test3() {
        Assertions.assertEquals(4193, new StringToInteger().myAtoi("4193 with words"));
    }

    @Test
    public void test4() {
        Assertions.assertEquals(0, new StringToInteger().myAtoi("words and 987"));
    }

    @Test
    public void test5() {
        Assertions.assertEquals(0x80000000, new StringToInteger().myAtoi("-91283472332"));
    }

    @Test
    public void test6() {
        Assertions.assertEquals(0, new StringToInteger().myAtoi(".12"));
    }

    @Test
    public void test7() {
        Assertions.assertEquals(0, new StringToInteger().myAtoi("+-12"));
    }

    @Test
    public void test8() {
        Assertions.assertEquals(0, new StringToInteger().myAtoi("+"));
    }

    @Test
    public void test9() {
        Assertions.assertEquals(0, new StringToInteger().myAtoi(
                "   +0 123"));
    }

    @Test
    public void test10() {
        Assertions.assertEquals(2147483647, new StringToInteger().myAtoi(
                "20000000000000000000"));
    }

    @Test
    public void test11() {
        Assertions.assertEquals(12345678, new StringToInteger().myAtoi(
                "  0000000000012345678"));
    }

    @Test
    public void test12() {
        Assertions.assertEquals(0, new StringToInteger().myAtoi(
                "00000-42a1234"));
    }

    @Test
    public void test13() {
        Assertions.assertEquals(3, new StringToInteger().myAtoi(
                "3.14159"));
    }

    @Test
    public void test14() {
        Assertions.assertEquals(-1, new StringToInteger().myAtoi(
                "-000000000000001"));
    }
    @Test
    public void test15() {
        Assertions.assertEquals(-12, new StringToInteger().myAtoi(
                "  -0012a42"));
    }
    @Test
    public void test16() {
        Assertions.assertEquals(-2147483647, new StringToInteger().myAtoi(
                "-2147483647"));
    }
}
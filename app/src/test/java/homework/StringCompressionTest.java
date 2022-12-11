package homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StringCompressionTest {
    private StringCompression obj = new StringCompression();

    @Test
    void test1() {
        Assertions.assertEquals(
                6,
                obj.compress("aabbccc".toCharArray())
        );
    }

    @Test
    void test2() {
        Assertions.assertEquals(
                1,
                obj.compress("a".toCharArray())
        );
    }

    @Test
    void test3() {
        Assertions.assertEquals(
                4,
                obj.compress("abbbbbbbbbbbb".toCharArray())
        );
    }

    @Test
    void test4() {
        Assertions.assertEquals(
                3,
                obj.compress("abc".toCharArray())
        );
    }
}
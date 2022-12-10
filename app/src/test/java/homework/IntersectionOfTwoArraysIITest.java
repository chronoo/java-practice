package homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class IntersectionOfTwoArraysIITest {
    IntersectionOfTwoArraysII obj = new IntersectionOfTwoArraysII();

    @Test
    void test1() {
        Assertions.assertEquals(
                new int[]{2, 2},
                obj.intersect(new int[]{1, 2, 2, 1}, new int[]{2, 2})
        );
    }

    @Test
    void test2() {
        Assertions.assertEquals(
                new int[]{4, 9},
                obj.intersect(new int[]{4,9,5}, new int[]{9,4,9,8,4})
        );
    }
}
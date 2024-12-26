package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class IntersectionOfTwoArraysTest {
    IntersectionOfTwoArrays obj = new IntersectionOfTwoArrays();

    @Test
    void test1() {
        assertThat(obj.intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2}))
            .isEqualTo(new int[]{2});
    }

    @Test
    void test2() {
        assertThat(obj.intersection(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4}))
            .isEqualTo(new int[]{4, 9});
    }
}
package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class FindThePrefixCommonArrayOfTwoArraysTest {
    FindThePrefixCommonArrayOfTwoArrays obj = new FindThePrefixCommonArrayOfTwoArrays();

    @Test
    void test1() {
        assertThat(obj.findThePrefixCommonArray(
            new int[]{1, 3, 2, 4},
            new int[]{3, 1, 2, 4}
        )).isEqualTo(new int[]{0, 2, 3, 4});
    }

    @Test
    void test2() {
        assertThat(obj.findThePrefixCommonArray(
            new int[]{2,3,1},
            new int[]{3,1,2}
        )).isEqualTo(new int[]{0,1,3});
    }
}
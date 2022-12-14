package homework;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SubarraySumEqualsKTest {
    private final SubarraySumEqualsK obj = new SubarraySumEqualsK();

    @Test
    void test1() {
        assertThat(obj.subarraySum(new int[]{1,1,1}, 2))
                .isEqualTo(2);
    }

    @Test
    void test2() {
        assertThat(obj.subarraySum(new int[]{1,2,3}, 3))
                .isEqualTo(2);
    }

    @Test
    void test3() {
        assertThat(obj.subarraySum(new int[]{1}, 1))
                .isEqualTo(1);
    }

    @Test
    void test4() {
        assertThat(obj.subarraySum(new int[]{-1,-1,1}, 1))
                .isEqualTo(1);
    }
}
package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class CountEqualAndDivisiblePairsInAnArrayTest {
    CountEqualAndDivisiblePairsInAnArray obj = new CountEqualAndDivisiblePairsInAnArray();

    @Test
    void test1() {
        assertThat(obj.countPairs(new int[]{
            3, 1, 2, 2, 2, 1, 3
        }, 2)).isEqualTo(4);
    }

    @Test
    void test2() {
        assertThat(obj.countPairs(new int[]{
            1, 2, 3, 4
        }, 1)).isEqualTo(0);
    }
}
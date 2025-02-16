package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class NumberOfGoodPairsTest {
    NumberOfGoodPairs obj = new NumberOfGoodPairs();

    @Test
    void test1() {
        assertThat(obj.numIdenticalPairs(new int[]{1, 2, 3, 1, 1, 3})).isEqualTo(4);
    }

    @Test
    void test2() {
        assertThat(obj.numIdenticalPairs(new int[]{1, 1, 1, 1})).isEqualTo(6);
    }

    @Test
    void test3() {
        assertThat(obj.numIdenticalPairs(new int[]{1, 2, 3})).isEqualTo(0);
    }
}
package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class DivisibleAndNonDivisibleSumsDifferenceTest {
    DivisibleAndNonDivisibleSumsDifference obj = new DivisibleAndNonDivisibleSumsDifference();

    @Test
    void test1() {
        assertThat(obj.differenceOfSums(10, 3)).isEqualTo(19);
    }

    @Test
    void test2() {
        assertThat(obj.differenceOfSums(5, 6)).isEqualTo(15);
    }

    @Test
    void test3() {
        assertThat(obj.differenceOfSums(5, 1)).isEqualTo(-15);
    }
}
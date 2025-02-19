package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class FindMinimumOperationsToMakeAllElementsDivisibleByThreeTest {
    FindMinimumOperationsToMakeAllElementsDivisibleByThree obj = new FindMinimumOperationsToMakeAllElementsDivisibleByThree();

    @Test
    void test1() {
        assertThat(obj.minimumOperations(new int[]{1, 2, 3, 4})).isEqualTo(3);
    }

    @Test
    void test2() {
        assertThat(obj.minimumOperations(new int[]{3, 6, 9})).isEqualTo(0);
    }
}
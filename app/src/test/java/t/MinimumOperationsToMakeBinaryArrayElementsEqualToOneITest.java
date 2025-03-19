package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class MinimumOperationsToMakeBinaryArrayElementsEqualToOneITest {
    MinimumOperationsToMakeBinaryArrayElementsEqualToOneI obj = new MinimumOperationsToMakeBinaryArrayElementsEqualToOneI();

    @Test
    void test1() {
        assertThat(obj.minOperations(new int[] {
            0,1,1,1,0,0
        })).isEqualTo(3);
    }

    @Test
    void test2() {
        assertThat(obj.minOperations(new int[] {
            0,1,1,1
        })).isEqualTo(-1);
    }
}
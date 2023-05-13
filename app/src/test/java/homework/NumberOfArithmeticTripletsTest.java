package homework;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class NumberOfArithmeticTripletsTest {
    private final NumberOfArithmeticTriplets obj = new NumberOfArithmeticTriplets();

    @Test
    void test1() {
        assertThat(obj.arithmeticTriplets(new int[]{
            0, 1, 4, 6, 7, 10
        }, 3)).isEqualTo(2);
    }

    @Test
    void test2() {
        assertThat(obj.arithmeticTriplets(new int[]{
            4,5,6,7,8,9
        }, 2)).isEqualTo(2);
    }
}
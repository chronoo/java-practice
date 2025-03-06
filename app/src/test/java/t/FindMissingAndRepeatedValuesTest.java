package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class FindMissingAndRepeatedValuesTest {
    FindMissingAndRepeatedValues obj = new FindMissingAndRepeatedValues();

    @Test
    void test1() {
        assertThat(obj.findMissingAndRepeatedValues(new int[][]{
            {1, 3}, {2, 2}
        })).isEqualTo(new int[]{2, 4});
    }

    @Test
    void test2() {
        assertThat(obj.findMissingAndRepeatedValues(new int[][]{
            {9,1,7},{8,9,2},{3,4,6}
        })).isEqualTo(new int[]{9,5});
    }
}
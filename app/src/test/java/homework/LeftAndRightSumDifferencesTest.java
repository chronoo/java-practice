package homework;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class LeftAndRightSumDifferencesTest {

    private final LeftAndRightSumDifferences obj = new LeftAndRightSumDifferences();

    @Test
    void test1() {
        assertThat(obj.leftRightDifference(new int[]{
            10,4,8,3
        })).isEqualTo(new int[] {
            15,1,11,22
        });
    }

    @Test
    void test2() {
        assertThat(obj.leftRightDifference(new int[]{
            1
        })).isEqualTo(new int[] {
            0
        });
    }
}
package homework;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class RunningSumOf1dArrayTest {

    private final RunningSumOf1dArray obj = new RunningSumOf1dArray();

    @Test
    void test1() {
        assertThat(obj.runningSum(new int[] {
            1,2,3,4
        })).isEqualTo(new int[] {
            1,3,6,10
        });
    }

    @Test
    void test2() {
        assertThat(obj.runningSum(new int[] {
            1,1,1,1,1
        })).isEqualTo(new int[] {
            1,2,3,4,5
        });
    }

    @Test
    void test3() {
        assertThat(obj.runningSum(new int[] {
            3,1,2,10,1
        })).isEqualTo(new int[] {
            3,4,6,16,17
        });
    }
}
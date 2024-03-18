package func;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BinarySubarraysWithSumTest {
    BinarySubarraysWithSum2 obj = new BinarySubarraysWithSum2();

    @Test
    void test1() {
        assertThat(obj.numSubarraysWithSum(new int[]{1, 0, 1, 0, 1}, 2))
                .isEqualTo(4);
    }

    @Test
    void test2() {
        assertThat(obj.numSubarraysWithSum(new int[]{0,0,0,0,0}, 0))
                .isEqualTo(15);
    }
    @Test
    void test4() {
        assertThat(obj.numSubarraysWithSum(new int[]{0,0,0,0,0,0,1,0,0,0}, 0))
                .isEqualTo(27);
    }
}

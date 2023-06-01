package homework;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CountNumberOfNiceSubarraysTest {

    private final CountNumberOfNiceSubarrays obj = new CountNumberOfNiceSubarrays();

    @Test
    void test1() {
        assertThat(obj.numberOfSubarrays(new int[] {
            1,1,2,1,1
        }, 3)).isEqualTo(2);
    }

    @Test
    void test2() {
        assertThat(obj.numberOfSubarrays(new int[] {
            2,4,6
        }, 1)).isEqualTo(0);
    }

    @Test
    void test3() {
        assertThat(obj.numberOfSubarrays(new int[] {
            2,2,2,1,2,2,1,2,2,2
        }, 2)).isEqualTo(16);
    }
}
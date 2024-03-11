package func;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PlusOneTest {
    private final PlusOne obj = new PlusOne();

    @Test
    void test1() {
        assertThat(obj.plusOne(new int[]{1, 2, 3}))
                .isEqualTo(new int[]{1, 2, 4});
    }

    @Test
    void test2() {
        assertThat(obj.plusOne(new int[]{4,3,2,1}))
                .isEqualTo(new int[]{4,3,2,2});
    }

    @Test
    void test3() {
        assertThat(obj.plusOne(new int[]{9}))
                .isEqualTo(new int[]{1,0});
    }
}

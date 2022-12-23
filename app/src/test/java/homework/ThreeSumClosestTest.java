package homework;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class ThreeSumClosestTest {

    private final ThreeSumClosest obj = new ThreeSumClosest();

    @Test
    void test1() {
        assertThat(obj.threeSumClosest(new int[]{-1,2,1,-4}, 1))
                .isEqualTo(2);
    }

    @Test
    void test2() {
        assertThat(obj.threeSumClosest(new int[]{0,0,0}, 1))
                .isEqualTo(0);
    }
}
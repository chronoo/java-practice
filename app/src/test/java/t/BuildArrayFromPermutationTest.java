package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class BuildArrayFromPermutationTest {
    BuildArrayFromPermutation obj = new BuildArrayFromPermutation();

    @Test
    void test1() {
        assertThat(obj.buildArray(new int[]{0, 2, 1, 5, 3, 4}))
            .isEqualTo(new int[]{0, 1, 2, 4, 5, 3});
    }

    @Test
    void test2() {
        assertThat(obj.buildArray(new int[]{5, 0, 1, 2, 3, 4}))
            .isEqualTo(new int[]{4, 5, 0, 1, 2, 3});
    }
}
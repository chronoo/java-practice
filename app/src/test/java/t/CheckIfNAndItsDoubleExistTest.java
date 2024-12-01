package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class CheckIfNAndItsDoubleExistTest {
    CheckIfNAndItsDoubleExist obj = new CheckIfNAndItsDoubleExist();

    @Test
    void test1() {
        assertThat(obj.checkIfExist(new int[]{10, 2, 5, 3}))
            .isTrue();
    }

    @Test
    void test2() {
        assertThat(obj.checkIfExist(new int[]{3, 1, 7, 11}))
            .isFalse();
    }

    @Test
    void test3() {
        assertThat(obj.checkIfExist(new int[]{-10, 12, -20, -8, 15}))
            .isTrue();
    }

    @Test
    void test4() {
        assertThat(obj.checkIfExist(new int[]{-16, -19}))
            .isFalse();
    }

    @Test
    void test5() {
        assertThat(obj.checkIfExist(new int[]{-2, 0, 10, -19, 4, 6, -8}))
            .isFalse();
    }

    @Test
    void test6() {
        assertThat(obj.checkIfExist(new int[]{-766, 259, 203, 601, 896, -226, -844, 168, 126, -542, 159, -833, 950, -454, -253, 824, -395, 155, 94, 894, -766, -63, 836, -433, -780, 611, -907, 695, -395, -975, 256, 373, -971, -813, -154, -765, 691, 812, 617, -919, -616, -510, 608, 201, -138, -669, -764, -77, -658, 394, -506, -675, 523}))
            .isTrue();
    }

    @Test
    void test7() {
        assertThat(obj.checkIfExist(new int[]{-20,8,-6,-14,0,-19,14,4}))
            .isTrue();
    }
}
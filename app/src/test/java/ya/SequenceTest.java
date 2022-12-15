package ya;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SequenceTest {
    @Test
    void test1() {
        assertThat(Sequence.min(new int[]{9, 4, 2, 5, 3}))
                .isEqualTo(6);
    }

    @Test
    void test9() {
        assertThat(Sequence.min(new int[]{-2,-2,5}))
                .isEqualTo(-10);
    }

    @Test
    void test10() {
        assertThat(Sequence.min(new int[]{0,0}))
                .isEqualTo(0);
    }

    @Test
    void test11() {
        assertThat(Sequence.min(new int[]{-3,-2,-1}))
                .isEqualTo(2);
    }

    @Test
    void test2() {
        assertThat(Sequence.min(new int[]{9, -4, 2, 5, 3}))
                .isEqualTo(-36);
    }

    @Test
    void test4() {
        assertThat(Sequence.min(new int[]{9, -4, 2, -3, 3}))
                .isEqualTo(-36);
    }

    @Test
    void test8() {
        assertThat(Sequence.min(new int[]{9, -4,-4, 2, -3, 3}))
                .isEqualTo(-36);
    }

    @Test
    void test5() {
        try {
            Sequence.min(new int[]{1});
        } catch (IllegalArgumentException e) {
            return;
        }
        Assertions.fail();
    }

    @Test
    void test6() {
        try {
            Sequence.min(new int[]{});
        } catch (IllegalArgumentException e) {
            return;
        }
        Assertions.fail();
    }

    @Test
    void test7() {
        try {
            Sequence.min(null);
        } catch (IllegalArgumentException e) {
            return;
        }
        Assertions.fail();
    }

    @Test
    void test3() {
        assertThat(Sequence.min(new int[]{9, 0, 2, 5, 3}))
                .isEqualTo(0);
    }
}
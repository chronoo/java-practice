package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class FindScoreOfAnArrayAfterMarkingAllElementsTest {
    FindScoreOfAnArrayAfterMarkingAllElements obj = new FindScoreOfAnArrayAfterMarkingAllElements();

    @Test
    void test1() {
        assertThat(obj.findScore(new int[]{2, 1, 3, 4, 5, 2})).isEqualTo(7);
    }

    @Test
    void test2() {
        assertThat(obj.findScore(new int[]{2, 3, 5, 1, 3, 2})).isEqualTo(5);
    }

    @Test
    void test3() {
        assertThat(obj.findScore(new int[]{10, 44, 10, 8, 48, 30, 17, 38, 41, 27, 16, 33, 45, 45, 34, 30, 22, 3, 42, 42})).isEqualTo(212);
    }

}
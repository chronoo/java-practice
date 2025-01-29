package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class FindTheTownJudgeTest {
    FindTheTownJudge obj = new FindTheTownJudge();

    @Test
    void test1() {
        assertThat(obj.findJudge(2, new int[][]{{1, 2}}))
            .isEqualTo(2);
    }

    @Test
    void test2() {
        assertThat(obj.findJudge(3, new int[][]{{1, 3}, {2, 3}}))
            .isEqualTo(3);
    }

    @Test
    void test3() {
        assertThat(obj.findJudge(3, new int[][]{{1, 3}, {2, 3}, {3, 1}}))
            .isEqualTo(-1);
    }

    @Test
    void test4() {
        assertThat(obj.findJudge(4, new int[][]{{1, 3},{1,4}, {2, 3}, {2,4}, {4,3}}))
            .isEqualTo(3);
    }
}
package t;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class CountPairsWhoseSumIsLessThanTargetTest {
    CountPairsWhoseSumIsLessThanTarget obj = new CountPairsWhoseSumIsLessThanTarget();

    @Test
    void test1() {
        assertThat(obj.countPairs(List.of(-1, 1, 2, 3, 1), 2)).isEqualTo(3);
    }

    @Test
    void test2() {
        assertThat(obj.countPairs(List.of(-6, 2, 5, -2, -7, -1, 3), -2)).isEqualTo(10);
    }
}
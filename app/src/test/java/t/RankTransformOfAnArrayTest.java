package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class RankTransformOfAnArrayTest {
    RankTransformOfAnArray obj = new RankTransformOfAnArray();

    @Test
    void test1() {
        assertThat(obj.arrayRankTransform(new int[]{40, 10, 20, 30})).isEqualTo(new int[]{4, 1, 2, 3});
    }

    @Test
    void test2() {
        assertThat(obj.arrayRankTransform(new int[]{100, 100, 100})).isEqualTo(new int[]{1, 1, 1});
    }

    @Test
    void test3() {
        assertThat(obj.arrayRankTransform(new int[]{37, 12, 28, 9, 100, 56, 80, 5, 12})).isEqualTo(new int[]{5, 3, 4, 2, 8, 6, 7, 1, 3});
    }
}
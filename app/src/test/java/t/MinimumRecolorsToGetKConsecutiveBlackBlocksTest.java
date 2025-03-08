package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class MinimumRecolorsToGetKConsecutiveBlackBlocksTest {
    MinimumRecolorsToGetKConsecutiveBlackBlocks obj = new MinimumRecolorsToGetKConsecutiveBlackBlocks();

    @Test
    void test1() {
        assertThat(obj.minimumRecolors("WBBWWBBWBW", 7)).isEqualTo(3);
    }

    @Test
    void test2() {
        assertThat(obj.minimumRecolors("WBWBBBW", 2)).isEqualTo(0);
    }

    @Test
    void test3() {
        assertThat(obj.minimumRecolors("WBB", 1)).isEqualTo(0);
    }
}
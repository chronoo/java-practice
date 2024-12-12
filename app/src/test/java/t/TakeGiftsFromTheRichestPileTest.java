package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class TakeGiftsFromTheRichestPileTest {
    TakeGiftsFromTheRichestPile obj = new TakeGiftsFromTheRichestPile();

    @Test
    void test1() {
        assertThat(obj.pickGifts(
            new int[]{25, 64, 9, 4, 100},
            4
        )).isEqualTo(29);
    }

    @Test
    void test2() {
        assertThat(obj.pickGifts(
            new int[]{1,1,1,1},
            4
        )).isEqualTo(4);
    }
}
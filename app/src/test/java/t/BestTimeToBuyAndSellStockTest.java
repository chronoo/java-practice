package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class BestTimeToBuyAndSellStockTest {
    BestTimeToBuyAndSellStock obj = new BestTimeToBuyAndSellStock();

    @Test
    void test1() {
        assertThat(obj.maxProfit(new int[] {
                7,1,5,3,6,4
        })).isEqualTo(5);
    }

    @Test
    void test2() {
        assertThat(obj.maxProfit(new int[] {
                7,6,4,3,1
        })).isEqualTo(0);
    }
}
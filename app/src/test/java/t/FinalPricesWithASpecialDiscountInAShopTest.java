package t;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class FinalPricesWithASpecialDiscountInAShopTest {
    FinalPricesWithASpecialDiscountInAShop obj = new FinalPricesWithASpecialDiscountInAShop();

    @Test
    void test1() {
        assertThat(obj.finalPrices(new int[]{8, 4, 6, 2, 3})).isEqualTo(new int[]{4, 2, 4, 2, 3});
    }

    @Test
    void test2() {
        assertThat(obj.finalPrices(new int[]{1, 2, 3, 4, 5})).isEqualTo(new int[]{1, 2, 3, 4, 5});
    }

    @Test
    void test3() {
        assertThat(obj.finalPrices(new int[]{10, 1, 1, 6})).isEqualTo(new int[]{9, 0, 1, 6});
    }
}
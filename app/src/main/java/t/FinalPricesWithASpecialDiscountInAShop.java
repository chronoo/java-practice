package t;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/final-prices-with-a-special-discount-in-a-shop
 */
public class FinalPricesWithASpecialDiscountInAShop {
    public int[] finalPrices(int[] prices) {
        var res = Arrays.copyOf(prices, prices.length);
        for (var i = 0; i < prices.length; i++) {
            var price = prices[i];
            for (var j = i + 1; j < prices.length; j++) {
                if (prices[j] <= price) {
                    res[i] -= prices[j];
                    break;
                }
            }
        }
        return res;
    }
}

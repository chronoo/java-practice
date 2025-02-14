package t;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/product-of-the-last-k-numbers
 */
public class ProductOfTheLastKNumbers {
    public static class ProductOfNumbers {
        private List<Integer> mult = new ArrayList<>();

        public void add(int num) {
            if (num == 0) mult = new ArrayList<>();
            else if (mult.isEmpty()) mult.add(num);
            else mult.add(mult.getLast() * num);
        }

        public int getProduct(int k) {
            if (k > mult.size()) return 0;
            if (k == mult.size()) return mult.getLast();
            return mult.getLast() / mult.get(mult.size() - k - 1);
        }
    }
}

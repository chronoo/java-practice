package t;

import java.util.ArrayList;

/**
 * https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer
 */
public class SubtractTheProductAndSumOfDigitsOfAnInteger {
    public int subtractProductAndSum(int n) {
        var digits = new ArrayList<Integer>();
        while (n >= 10) {
            digits.add(n % 10);
            n /= 10;
        }
        digits.add(n);
        var sum = digits.stream().mapToInt(x -> x).sum();
        var product = digits.stream().mapToInt(x -> x).reduce(1, (x, y) -> x * y);
        return product - sum;
    }
}

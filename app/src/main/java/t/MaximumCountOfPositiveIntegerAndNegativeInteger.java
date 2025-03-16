package t;

/**
 * https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer
 */
public class MaximumCountOfPositiveIntegerAndNegativeInteger {
    public int maximumCount(int[] nums) {
        var positive = 0;
        var negative = 0;
        for (var num : nums) {
            if (num > 0) positive++;
            else if (num < 0) negative++;
        }
        return Math.max(positive, negative);
    }
}

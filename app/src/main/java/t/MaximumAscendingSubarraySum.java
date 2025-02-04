package t;

/**
 * https://leetcode.com/problems/maximum-ascending-subarray-sum
 */
public class MaximumAscendingSubarraySum {
    public int maxAscendingSum(int[] nums) {
        var maxSum = -1;
        var curSum = 0;
        var prev = -1;
        for (var cur : nums) {
            if (cur > prev) {
                curSum += cur;
                maxSum = Math.max(maxSum, curSum);
            } else {
                curSum = cur;
            }
            prev = cur;
        }
        return maxSum;
    }
}

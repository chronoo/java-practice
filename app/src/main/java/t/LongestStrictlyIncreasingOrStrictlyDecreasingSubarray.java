package t;

/**
 * https://leetcode.com/problems/longest-strictly-increasing-or-strictly-decreasing-subarray
 */
public class LongestStrictlyIncreasingOrStrictlyDecreasingSubarray {
    public int longestMonotonicSubarray(int[] nums) {
        var maxIncreasing = 1;
        var maxDecreasing = 1;
        var curIncreasing = 1;
        var curDecreasing = 1;
        var prev = nums[0];
        for (var i = 1; i < nums.length; i++) {
            var cur = nums[i];
            if (cur > prev) {
                curIncreasing++;
                curDecreasing = 1;
            } else if (cur < prev) {
                curDecreasing++;
                curIncreasing = 1;
            } else {
                curDecreasing = 1;
                curIncreasing = 1;
            }
            maxIncreasing = Math.max(maxIncreasing, curIncreasing);
            maxDecreasing = Math.max(maxDecreasing, curDecreasing);
            prev = cur;
        }
        return Math.max(maxIncreasing, maxDecreasing);
    }
}

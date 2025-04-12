package t;

/**
 * https://leetcode.com/problems/sum-of-variable-length-subarrays
 */
public class SumOfVariableLengthSubarrays {
    public int subarraySum(int[] nums) {
        var sum = 0;
        for (var i = 0; i < nums.length; i++) {
            var start = Math.max(0, i - nums[i]);
            for (var j = start; j <= i; j++) {
                sum += nums[j];
            }
        }
        return sum;
    }
}

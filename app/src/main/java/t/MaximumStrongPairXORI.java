package t;

/**
 * https://leetcode.com/problems/maximum-strong-pair-xor-i
 */
public class MaximumStrongPairXORI {
    public int maximumStrongPairXor(int[] nums) {
        var max = 0;
        for (var i = 0; i < nums.length; i++) {
            var current = nums[i];
            for (var j = i + 1; j < nums.length; j++) {
                var next = nums[j];
                if ((current ^ next) > max && Math.abs(current - next) <= Math.min(current, next)) max = current ^ next;
            }
        }
        return max;
    }
}

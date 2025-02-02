package t;

/**
 * https://leetcode.com/problems/check-if-array-is-sorted-and-rotated
 */
public class CheckIfArrayIsSortedAndRotated {
    public boolean check(int[] nums) {
        var was = false;
        var prev = nums[nums.length - 1];
        for (var num : nums) {
            if (num < prev) {
                if (was) return false;
                was = true;
            }
            prev = num;
        }
        return true;
    }
}

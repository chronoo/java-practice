package t;

/**
 * https://leetcode.com/problems/minimum-operations-to-make-binary-array-elements-equal-to-one-i
 */
public class MinimumOperationsToMakeBinaryArrayElementsEqualToOneI {
    public int minOperations(int[] nums) {
        var steps = 0;
        for (var i = 0; i <= nums.length - 3; i++) {
            if (nums[i] == 0) {
                steps++;
                nums[i] = nums[i] == 0 ? 1 : 0;
                nums[i + 1] = nums[i + 1] == 0 ? 1 : 0;
                nums[i + 2] = nums[i + 2] == 0 ? 1 : 0;
            }
        }
        for (var i = nums.length - 1; i > nums.length - 3; i--) {
            if (nums[i] == 0) return -1;
        }
        return steps;
    }
}

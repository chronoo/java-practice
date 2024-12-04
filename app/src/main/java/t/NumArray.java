package t;

/**
 * https://leetcode.com/problems/range-sum-query-immutable
 */
public class NumArray {
    private final int[] sums;

    public NumArray(int[] nums) {
        sums = new int[nums.length];
        var sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            sums[i] = sum;
        }
    }

    public int sumRange(int left, int right) {
        return left == 0 ? sums[right] : sums[right] - sums[left - 1];
    }
}

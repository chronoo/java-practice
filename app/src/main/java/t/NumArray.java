package t;

/**
 * https://leetcode.com/problems/range-sum-query-immutable
 */
public class NumArray {
    private final int[] nums;

    public NumArray(int[] nums) {
        this.nums = nums;
    }

    public int sumRange(int left, int right) {
        var sum = 0;
        for (int i = left; i <= right; i++) {
            sum += nums[i];
        }
        return sum;
    }
}

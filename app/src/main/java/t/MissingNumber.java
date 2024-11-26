package t;

/**
 * https://leetcode.com/problems/missing-number
 */
public class MissingNumber {
    public int missingNumber(int[] nums) {
        var x = nums.length;
        var sum = (1 + x) * x / 2;
        for (int num : nums) {
            sum -= num;
        }
        return sum;
    }
}

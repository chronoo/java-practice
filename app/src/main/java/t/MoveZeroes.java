package t;

/**
 * https://leetcode.com/problems/move-zeroes
 */
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        var start = 0;
        for (var end = 0; end < nums.length; end++) {
            if (nums[end] != 0) {
                nums[start] = nums[end];
                if (start != end) nums[end] = 0;
                start++;
            }
        }
    }
}

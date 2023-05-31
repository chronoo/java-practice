package homework;

public class MaxConsecutiveOnesIII {
    public int longestOnes(int[] nums, int k) {
        int left = 0, right = 0;
        for (; left < nums.length ; left++) {
            if (nums[left] == 0) k--;
            if (k < 0) {
                if (nums[right] == 0) k++;
                right++;
            }
        }
        return left - right;
    }
}

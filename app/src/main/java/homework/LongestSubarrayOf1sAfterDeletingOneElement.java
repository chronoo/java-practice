package homework;

public class LongestSubarrayOf1sAfterDeletingOneElement {
    public int longestSubarray(int[] nums) {
        int res = 0;
        int start = 0;
        int zeros = 0;
        for (int end = 0; end < nums.length; end++) {
            if (nums[end] == 0) {
                zeros++;
            }

            for (; zeros > 1; start++) {
                if (nums[start] == 0) {
                    zeros--;
                }
            }

            res = Math.max(res, end - start);
        }
        return res;
    }
}

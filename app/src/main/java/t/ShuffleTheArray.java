package t;

/**
 * https://leetcode.com/problems/shuffle-the-array
 */
public class ShuffleTheArray {
    public int[] shuffle(int[] nums, int n) {
        var res = new int[nums.length];
        for (var i = 0; i < n; i++) {
            res[i * 2] = nums[i];
            res[i * 2 + 1] = nums[i + n];
        }
        return res;
    }
}

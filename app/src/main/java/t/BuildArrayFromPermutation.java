package t;

/**
 * https://leetcode.com/problems/build-array-from-permutation
 */
public class BuildArrayFromPermutation {
    public int[] buildArray(int[] nums) {
        var res = new int[nums.length];
        for (var i = 0; i < nums.length; i++) {
            res[i] = nums[nums[i]];
        }
        return res;
    }
}

package t;

/**
 * https://leetcode.com/problems/transform-array-by-parity
 */
public class TransformArrayByParity {
    public int[] transformArray(int[] nums) {
        var res = new int[nums.length];
        var odd = nums.length - 1;
        for (var num : nums) if (num % 2 == 1) res[odd--] = 1;
        return res;
    }
}

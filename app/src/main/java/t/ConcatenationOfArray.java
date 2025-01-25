package t;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/concatenation-of-array
 */
public class ConcatenationOfArray {
    public int[] getConcatenation(int[] nums) {
        var copy = Arrays.copyOf(nums, nums.length * 2);
        System.arraycopy(nums, 0, copy, nums.length, nums.length);
        return copy;
    }
}

package t;

/**
 * https://leetcode.com/problems/divide-array-into-equal-pairs
 */
public class DivideArrayIntoEqualPairs {
    public boolean divideArray(int[] nums) {
        var freq = new int[501];
        for (var num : nums) freq[num]++;
        for (var cur : freq) if (cur % 2 == 1) return false;
        return true;
    }
}

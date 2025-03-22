package t;

/**
 * https://leetcode.com/problems/sum-of-all-subset-xor-totals
 */
public class SumOfAllSubsetXORTotals {
    public int subsetXORSum(int[] nums) {
        var sum = 0;
        for (var num : nums) sum |= num;
        return sum << (nums.length - 1);
    }
}

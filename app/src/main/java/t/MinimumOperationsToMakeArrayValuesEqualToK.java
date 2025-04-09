package t;

import java.util.HashSet;

/**
 * https://leetcode.com/problems/minimum-operations-to-make-array-values-equal-to-k
 */
public class MinimumOperationsToMakeArrayValuesEqualToK {
    public int minOperations(int[] nums, int k) {
        var uniqueNums = new HashSet<>();
        for (var num : nums) {
            if (num < k) return -1;
            if (num > k) uniqueNums.add(num);
        }
        return uniqueNums.size();
    }
}

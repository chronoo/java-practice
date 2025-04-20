package t;

import java.util.List;

/**
 * https://leetcode.com/problems/sum-of-values-at-indices-with-k-set-bits
 */
public class SumOfValuesAtIndicesWithKSetBits {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        var sum = 0;
        for (var i = 0; i < nums.size(); i++) if (Integer.bitCount(i) == k) sum += nums.get(i);
        return sum;
    }
}

package t;

/**
 * https://leetcode.com/problems/number-of-good-pairs
 */
public class NumberOfGoodPairs {
    public int numIdenticalPairs(int[] nums) {
        var counts = new int[101];
        var res = 0;
        for (var num : nums) {
            res += counts[num];
            counts[num]++;
        }
        return res;
    }
}

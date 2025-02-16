package t;

/**
 * https://leetcode.com/problems/number-of-good-pairs
 */
public class NumberOfGoodPairs {
    public int numIdenticalPairs(int[] nums) {
        var count = 0;
        for (var i = 0; i < nums.length; i++) {
            var first = nums[i];
            for (var j = i + 1; j < nums.length; j++) {
                var second = nums[j];
                if (first == second) count++;
            }
        }
        return count;
    }
}

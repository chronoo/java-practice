package t;

/**
 * https://leetcode.com/problems/find-minimum-operations-to-make-all-elements-divisible-by-three
 */
public class FindMinimumOperationsToMakeAllElementsDivisibleByThree {
    public int minimumOperations(int[] nums) {
        var sum = 0;
        for (var num : nums) {
            if (num % 3 != 0) sum++;
        }
        return sum;
    }
}

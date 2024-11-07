package t;

/**
 * https://leetcode.com/problems/largest-combination-with-bitwise-and-greater-than-zero
 */
public class LargestCombinationWithBitwiseANDGreaterThanZero {
    public int largestCombination(int[] candidates) {
        var max = 0;
        for (int i = 0; i < 24; i++) {
            var count = 0;
            for (int candidate : candidates) {
                if ((candidate & 1 << i) > 0) {
                    count += 1;
                }
            }
            max = Math.max(max, count);
        }
        return max;
    }
}

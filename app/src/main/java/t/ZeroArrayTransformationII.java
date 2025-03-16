package t;

/**
 * https://leetcode.com/problems/zero-array-transformation-ii
 */
public class ZeroArrayTransformationII {
    public int minZeroArray(int[] nums, int[][] queries) {
        for (var j = 0; j < queries.length; j++) {
            var query = queries[j];
            var onlyZeros = true;
            for (var i = query[0]; i < query[1]; i++) {
                nums[i] -= query[2];
                if (nums[i] > 0) onlyZeros = false;
            }
            if (onlyZeros) return ++j;
        }
        return -1;
    }
}

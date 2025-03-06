package t;

/**
 * https://leetcode.com/problems/find-missing-and-repeated-values
 */
public class FindMissingAndRepeatedValues {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        var missing = 1;
        var repeated = 1;
        var freq = new int[grid.length * grid.length];
        for (var row : grid) {
            for (var cell : row) {
                freq[cell - 1]++;
            }
        }
        for (var i = 0; i < freq.length; i++) {
            if (freq[i] == 0) missing = i + 1;
            else if (freq[i] == 2) repeated = i + 1;
        }
        return new int[]{repeated, missing};
    }
}

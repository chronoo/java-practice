package t;

/**
 * https://leetcode.com/problems/largest-local-values-in-a-matrix
 */
public class LargestLocalValuesInAMatrix {
    public int[][] largestLocal(int[][] grid) {
        var side = grid.length - 2;
        var res = new int[side][side];
        for (var i = 0; i < side; i++) {
            for (var j = 0; j < side; j++) {
                var max = Integer.MIN_VALUE;
                for (var ii = i; ii < i + 3; ii++) {
                    for (var jj = j; jj < j + 3; jj++) {
                        max = Math.max(grid[ii][jj], max);
                    }
                }
                res[i][j] = max;
            }
        }
        return res;
    }
}

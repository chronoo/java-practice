package t;

/**
 * https://leetcode.com/problems/matrix-diagonal-sum
 */
public class MatrixDiagonalSum {
    public int diagonalSum(int[][] mat) {
        var sum = 0;
        var length = mat.length;
        for (var i = 0; i < length; i++) {
            sum += mat[i][i];
            if (i != length - i - 1) {
                sum += mat[length - i - 1][i];
            }
        }
        return sum;
    }
}

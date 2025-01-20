package t;

/**
 * https://leetcode.com/problems/first-completely-painted-row-or-column
 */
public class FirstCompletelyPaintedRowOrColumn {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        var rowsCount = mat.length;
        var columnsCount = mat[0].length;
        var rows = new int[rowsCount];
        var columns = new int[columnsCount];
        var reverted = new int[rowsCount * columnsCount];
        for (var i = 0; i < rowsCount; i++) {
            for (var j = 0; j < columnsCount; j++) {
                reverted[mat[i][j] - 1] = i * columnsCount + j;
            }
        }
        for (var j = 0; j < arr.length; j++) {
            var currentCell = arr[j];
            var i = reverted[currentCell - 1];
            rows[i / columnsCount]++;
            columns[i % columnsCount]++;
            if (rows[i / columnsCount] == columnsCount || columns[i % columnsCount] == rowsCount) return j;
        }
        return -1;
    }
}

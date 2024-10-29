package t;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * https://leetcode.com/problems/maximum-number-of-moves-in-a-grid
 */
public class MaximumNumberOfMovesInAGrid {
    public int maxMoves(int[][] grid) {
        if (grid.length == 0) return grid[0].length;
        var max = new AtomicInteger(0);
        for (int x = 0; x < grid.length; x++) {
            proc(grid, max, x, 0, 0);
        }
        return max.get();
    }

    private void proc(int[][] grid, AtomicInteger max, int x, int y, int depth) {
        int cur = grid[x][y];
        if (depth > max.get()) {
            max.set(depth);
        }
        if (y + 1 < grid[0].length) {
            if (x - 1 >= 0) {
                int next1 = grid[x-1][y + 1];
                if (next1 > cur) {
                    proc(grid, max, x-1, y + 1, depth + 1);
                }
            }
            if (x + 1 < grid.length) {
                int next2 = grid[x+1][y + 1];
                if (next2 > cur) {
                    proc(grid, max, x+1, y + 1, depth + 1);
                }
            }
            int next3 = grid[x][y + 1];
            if (next3 > cur) {
                proc(grid, max, x, y + 1, depth + 1);
            }
        }
    }
}

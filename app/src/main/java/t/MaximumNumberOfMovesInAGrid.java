package t;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * https://leetcode.com/problems/maximum-number-of-moves-in-a-grid
 */
public class MaximumNumberOfMovesInAGrid {
    int ans = 0;
    Integer[][] dp;
    public int maxMoves(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        dp = new Integer[n + 1][m + 1];
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, dfs(grid, i, 0, 0) - 1);
        }
        return ans;
    }

    int dfs(int[][] grid, int x, int y, int prev) {
        int n = grid.length;
        int m = grid[0].length;
        if (x < 0 || x == n || y < 0 || y == m || grid[x][y] <= prev) {
            return 0;
        }
        if (dp[x][y] != null) return dp[x][y];
        int val = grid[x][y];
        int a  = 1  + dfs(grid, x - 1, y + 1,val);
        int b = 1 + dfs(grid, x + 1, y + 1,val);
        int c = 1 + dfs(grid, x, y + 1,val);
        return dp[x][y] = Math.max(a, Math.max(b, c));
    }
}

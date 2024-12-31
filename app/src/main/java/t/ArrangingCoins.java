package t;

/**
 * https://leetcode.com/problems/arranging-coins
 */
public class ArrangingCoins {
    public int arrangeCoins(int n) {
        var res = 0L;
        var row = 0;
        while (true) {
            if (res > n) break;
            row++;
            res += row;
        }
        return row - 1;
    }
}

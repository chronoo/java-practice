package t;

/**
 * https://leetcode.com/problems/arranging-coins
 */
public class ArrangingCoins {
    public int arrangeCoins(int n) {
        return (int) ((Math.sqrt(1 + (long) 8 * n) - 1) / 2);
    }
}

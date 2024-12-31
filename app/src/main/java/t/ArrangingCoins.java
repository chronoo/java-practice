package t;

/**
 * https://leetcode.com/problems/arranging-coins
 */
public class ArrangingCoins {
    public int arrangeCoins(int n) {
        var left = 0L;
        var right = (long) n;
        while (left <= right) {
            var middle = left + (right - left) / 2;
            var summ = middle * (middle + 1) / 2;
            if (summ < n) left = middle + 1;
            else if (summ > n) right = middle - 1;
            else return (int) middle;
        }
        return (int) right;
    }
}

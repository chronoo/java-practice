package t;

/**
 * https://leetcode.com/problems/power-of-four
 */
public class PowerOfFour {
    public boolean isPowerOfFour(int n) {
        return n > 0 && Integer.bitCount(n) == 1 && (n - 1) % 3 == 0;
    }
}

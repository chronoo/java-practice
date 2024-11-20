package t;

/**
 * https://leetcode.com/problems/power-of-two
 */
public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if (n == 1) return true;
        for (int i = 0; i < 30; i++) {
            if (n == 2 << i) return true;
        }
        return false;
    }
}

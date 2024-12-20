package t;

/**
 * https://leetcode.com/problems/ugly-number
 */
public class UglyNumber {
    public boolean isUgly(int n) {
        while (true) {
            if (n == 0) return false;
            if (n > 0 && n <= 3) return true;
            if (n % 2 == 0) n /= 2;
            else if (n % 3 == 0) n /= 3;
            else if (n % 5 == 0) n /= 5;
            else return false;
        }
    }
}

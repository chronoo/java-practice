package t;

/**
 * https://leetcode.com/problems/powx-n/
 */
public class Pow {
    public double myPow(double x, int n) {
        if (x == 1) return 1.0;
        if (x == -1) return n % 2 == 1 ? -1.0 : 1.0;
        if (n == Integer.MIN_VALUE) return 0.0;
        if (n > 0) {
            double res = x;
            for (int i = n; i > 1; i--) {
                res *= x;
            }
            return res;
        } else if (n < 0) {
            return 1.0 / myPow(x, -n);
        } else return 1.0;
    }
}

package func;

public class Sqrt {
    public int mySqrt(int x) {
        if (x < 2) return x;
        int left = 0, right = x;
        while ((right - left) > 2) {
            long semiSum = (left + right) / 2;
            if (semiSum * semiSum > x) {
                right -= (right - left) / 2;
            } else {
                left += (right - left) / 2;
            }
        }
        return left;
    }
}

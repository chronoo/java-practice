package homework;

public class DivideTwoIntegers {
    public int divide(int dividend, int divisor) {
        if (dividend == divisor) return 1;
        if (dividend == 0) return 0;
        boolean isPositive = isPositive(dividend, divisor);
        long divisor1 = divisor > 0 ? divisor : -(long) divisor;
        long dividend1 = dividend > 0 ? dividend : -(long) dividend;
        if (dividend1 < divisor1) return 0;
        long curSumm = divisor1;
        int result = 1;
        while (true) {
            if (curSumm << 1 > dividend1) {
                break;
            }
            curSumm <<= 1;
            result <<= 1;
        }
        while (true) {
            if (dividend1 - curSumm >= divisor1) {
                curSumm += divisor1;
                result++;
            } else break;
        }
        curSumm = isPositive ? curSumm : -curSumm;
        if (curSumm > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if (curSumm < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        return isPositive ? result : -result;
    }

    private boolean isPositive(int dividend, int divisor) {
        return dividend >= 0 && divisor >= 0 || dividend < 0 && divisor < 0;
    }
}

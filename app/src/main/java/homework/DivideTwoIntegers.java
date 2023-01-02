package homework;

public class DivideTwoIntegers {
    public int divide(int dividend, int divisor) {
        if (dividend == 0) return 0;
        boolean isPositive = isPositive(dividend, divisor);
        divisor = divisor > 0 ? divisor : -divisor;
        if (dividend == Integer.MIN_VALUE && divisor == 1) return isPositive ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        if (dividend == Integer.MAX_VALUE && divisor == 1) return isPositive ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        dividend = dividend > 0 ? dividend : -dividend;
        if (dividend < divisor) return 0;
        int curSumm = divisor;
        int result = 1;
        while (true) {
            if (curSumm << 1 > dividend || Integer.MAX_VALUE - curSumm < curSumm) {
                break;
            }
            curSumm <<= 1;
            result <<= 1;
        }
        while (true) {
            if (dividend - curSumm >= divisor) {
                curSumm += divisor;
                result++;
            } else break;
        }
        return isPositive ? result : -result;
    }

    private boolean isPositive(int dividend, int divisor) {
        return dividend >= 0 && divisor >= 0 || dividend < 0 && divisor < 0;
    }
}

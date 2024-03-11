package func;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        digits[digits.length - 1]++;
        for (int i = digits.length - 1; i > 0; i--) {
            if (digits[i] < 10) return digits;
            digits[i] %= 10;
            digits[i - 1]++;
        }
        if (digits[0] > 9) {
            digits[0] %= 10;
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            System.arraycopy(digits, 0, result, 1, digits.length);
            return result;
        }
        return digits;
    }
}

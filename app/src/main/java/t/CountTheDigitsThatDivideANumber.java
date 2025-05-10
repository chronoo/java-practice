package t;

/**
 * https://leetcode.com/problems/count-the-digits-that-divide-a-number
 */
public class CountTheDigitsThatDivideANumber {
    public int countDigits(int num) {
        var count = 0;
        var medium = num;
        do {
            if (num % (medium % 10) == 0) count++;
            medium /= 10;
        } while (medium > 0);
        return count;
    }
}

package t;

/**
 * https://leetcode.com/problems/guess-number-higher-or-lower
 */
public class GuessNumberHigherOrLower {
    private final int picked;

    public GuessNumberHigherOrLower(int n) {
        this.picked = n;
    }

    public int guessNumber(int n) {
        var left = 1;
        var right = n;
        while (left < right) {
            var middle = left + (right - left) / 2;
            var comparingResult = guess(middle);
            if (comparingResult == 0) return middle;
            else if (comparingResult == -1) right = middle - 1;
            else left = middle + 1;
        }
        return left;
    }

    public int guess(int num) {
        if (num < picked) return 1;
        if (num > picked) return -1;
        return 0;
    }
}

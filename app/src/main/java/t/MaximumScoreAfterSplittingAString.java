package t;

/**
 * https://leetcode.com/problems/maximum-score-after-splitting-a-string
 */
public class MaximumScoreAfterSplittingAString {
    public int maxScore(String s) {
        var zeros = new int[s.length()];
        var ones = new int[s.length()];
        var curZeros = 0;
        var curOnes = 0;
        var charArray = s.toCharArray();
        var length = charArray.length;
        for (int i = 0; i < length; i++) {
            if (charArray[i] == '0') zeros[i] = ++curZeros;
            if (charArray[length - i - 1] == '1') ones[length - i - 1] = ++curOnes;
        }
        var res = 0;
        for (int i = 0; i < length - 1; i++) {
            if (ones[i+1] + zeros[i] > res) res = ones[i+1] + zeros[i];
        }
        return res;
    }
}

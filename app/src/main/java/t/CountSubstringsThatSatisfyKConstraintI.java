package t;

/**
 * https://leetcode.com/problems/count-substrings-that-satisfy-k-constraint-i
 */
public class CountSubstringsThatSatisfyKConstraintI {
    public int countKConstraintSubstrings(String s, int k) {
        var count = 0;
        var chars = s.toCharArray();
        for (var i = 0; i < chars.length; i++) {
            var zeros = 0;
            var ones = 0;
            for (var j = i; j < chars.length; j++) {
                if (chars[j] == '0') zeros++;
                else ones++;
                if (zeros > k && ones > k) break;
                count++;
            }
        }
        return count;
    }
}

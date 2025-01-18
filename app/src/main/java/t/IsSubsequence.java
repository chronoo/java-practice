package t;

/**
 * https://leetcode.com/problems/is-subsequence
 */
public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        var sp = 0;
        var tp = 0;
        while (sp < s.length() && tp < t.length()) {
            if (s.charAt(sp) == t.charAt(tp)) {
                sp++;
            }
            tp++;
        }
        return sp == s.length();
    }
}

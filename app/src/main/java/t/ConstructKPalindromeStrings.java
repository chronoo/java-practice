package t;

/**
 * https://leetcode.com/problems/construct-k-palindrome-strings
 */
public class ConstructKPalindromeStrings {
    public boolean canConstruct(String s, int k) {
        var freqs = new int[26];
        for (var c : s.toCharArray()) {
            freqs[c - 'a']++;
        }
        var odds = 0;
        for (var freq : freqs) {
            odds += freq % 2;
        }
        return odds <= k && k <= s.length();
    }
}

package t;

/**
 * https://leetcode.com/problems/longest-palindrome
 */
public class LongestPalindrome {
    public int longestPalindrome(String s) {
        var freq = new int[128];
        for (var c : s.toCharArray()) {
            freq[c]++;
        }
        var count = 0;
        for (var fr : freq) {
            count += (fr / 2) * 2;
        }
        return count < s.length() ? ++count : count;
    }
}

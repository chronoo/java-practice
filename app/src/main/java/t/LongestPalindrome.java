package t;

/**
 * https://leetcode.com/problems/longest-palindrome
 */
public class LongestPalindrome {
    public int longestPalindrome(String s) {
        var freq = new int[100];
        for (var c : s.toCharArray()) {
            freq[c - 'A']++;
        }
        var count = 0;
        var hasOdd = false;
        for (var fr : freq) {
            if (fr >= 2) count += fr - fr % 2;
            hasOdd = hasOdd || fr % 2 == 1;
        }
        return count + (hasOdd ? 1 : 0);
    }
}

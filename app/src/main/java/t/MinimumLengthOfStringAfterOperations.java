package t;

/**
 * https://leetcode.com/problems/minimum-length-of-string-after-operations
 */
public class MinimumLengthOfStringAfterOperations {
    public int minimumLength(String s) {
        var freq = new int[26];
        for (var cur : s.toCharArray()) {
            freq[cur - 'a']++;
        }
        var count = 0;
        for (var fr : freq) {
            count += fr > 0 ? fr % 2 == 0 ? 2 : 1 : 0;
        }
        return count;
    }
}

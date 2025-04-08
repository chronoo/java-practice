package t;

/**
 * https://leetcode.com/problems/truncate-sentence/
 */
public class TruncateSentence {
    public String truncateSentence(String s, int k) {
        var end = 0;
        var chars = s.toCharArray();
        var spaces = 0;
        while (end < chars.length) {
            if (chars[end] == ' ') spaces++;
            if (spaces >= k) break;
            end++;
        }
        return s.substring(0, end);
    }
}

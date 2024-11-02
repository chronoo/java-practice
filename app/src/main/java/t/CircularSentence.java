package t;

/**
 * https://leetcode.com/problems/circular-sentence
 */
public class CircularSentence {
    public boolean isCircularSentence(String sentence) {
        var chars = sentence.toCharArray();
        if (chars[0] != chars[sentence.length() - 1]) return false;
        for (int i = 1; i < chars.length - 1; i++) {
            char cur = chars[i];
            if (cur == ' ' && chars[i - 1] != chars[i+1]) return false;
        }
        return true;
    }
}

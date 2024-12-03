package t;

/**
 * https://leetcode.com/problems/word-pattern
 */
public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        var chars = pattern.toCharArray();
        var words = s.split(" ");
        if (chars.length != words.length) return false;
        for (var i = 0; i < chars.length; i++) {
            for (var j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j] && !words[i].equals(words[j])) return false;
                if (chars[i] != chars[j] && words[i].equals(words[j])) return false;
            }
        }
        return true;
    }
}

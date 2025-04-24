package t;

/**
 * https://leetcode.com/problems/shuffle-string
 */
public class ShuffleString {
    public String restoreString(String s, int[] indices) {
        var letters = new char[indices.length];
        var chars = s.toCharArray();
        for (var i = 0; i < indices.length; i++) letters[indices[i]] = chars[i];
        return String.valueOf(letters);
    }
}

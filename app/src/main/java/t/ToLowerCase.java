package t;

/**
 * https://leetcode.com/problems/to-lower-case
 */
public class ToLowerCase {
    public String toLowerCase(String s) {
        var letters = s.toCharArray();
        for (var i = 0; i < letters.length; i++) if (letters[i] >= 'A' && letters[i] <= 'Z') letters[i] += 32;
        return String.valueOf(letters);
    }
}

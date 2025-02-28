package t;

/**
 * https://leetcode.com/problems/count-the-number-of-consistent-strings
 */
public class CountTheNumberOfConsistentStrings {
    public int countConsistentStrings(String allowed, String[] words) {
        var count = 0;
        circle:
        for (var word : words) {
            var letters = new boolean[26];
            for (char letter : word.toCharArray()) letters[letter - 'a'] = true;
            var allowedLetters = new boolean[26];
            for (char letter : allowed.toCharArray()) allowedLetters[letter - 'a'] = true;
            for (var i = 0; i < letters.length; i++) if (letters[i] && !allowedLetters[i]) continue circle;
            count++;
        }
        return count;
    }
}

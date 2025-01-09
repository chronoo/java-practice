package t;

/**
 * https://leetcode.com/problems/counting-words-with-a-given-prefix
 */
public class CountingWordsWithAGivenPrefix {
    public int prefixCount(String[] words, String pref) {
        var count = 0;
        for (String word : words) {
            if (word.startsWith(pref)) count++;
        }
        return count;
    }
}

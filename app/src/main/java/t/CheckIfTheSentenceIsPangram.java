package t;

/**
 * https://leetcode.com/problems/check-if-the-sentence-is-pangram
 */
public class CheckIfTheSentenceIsPangram {
    public boolean checkIfPangram(String sentence) {
        var existence = new boolean[26];
        for (var letter : sentence.toCharArray()) {
            existence[letter - 'a'] = true;
        }
        for (var cur : existence) {
            if (!cur) return false;
        }
        return true;
    }
}

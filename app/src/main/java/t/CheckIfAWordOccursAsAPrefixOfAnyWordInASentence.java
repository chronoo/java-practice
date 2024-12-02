package t;

/**
 * https://leetcode.com/problems/check-if-a-word-occurs-as-a-prefix-of-any-word-in-a-sentence
 */
public class CheckIfAWordOccursAsAPrefixOfAnyWordInASentence {
    public int isPrefixOfWord(String sentence, String searchWord) {
        var chars = sentence.toCharArray();
        var wordChars = searchWord.toCharArray();
        var nums = 1;
        var isStart = true;
        for (var start = 0; start <= (chars.length - searchWord.length()); start++) {
            if (chars[start] == ' ') {
                nums++;
                isStart = true;
                continue;
            }
            if (isStart) {
                var x = 0;
                for (; x < wordChars.length; x++) {
                    if (chars[start + x] != wordChars[x]) break;
                }
                if (x == searchWord.length()) return nums;
                isStart = false;
            }
        }
        return -1;
    }
}

package t;

/**
 * https://leetcode.com/problems/maximum-number-of-words-found-in-sentences
 */
public class MaximumNumberOfWordsFoundInSentences {
    public int mostWordsFound(String[] sentences) {
        var countMax = 0;
        for (var sentence : sentences) {
            var curCount = 1;
            for (var cur : sentence.toCharArray()) {
                if (cur == ' ') curCount++;
            }
            countMax = Math.max(countMax, curCount);
        }
        return countMax;
    }
}

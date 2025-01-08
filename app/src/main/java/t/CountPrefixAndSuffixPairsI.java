package t;

/**
 * https://leetcode.com/problems/count-prefix-and-suffix-pairs-i
 */
public class CountPrefixAndSuffixPairsI {
    public int countPrefixSuffixPairs(String[] words) {
        var count = 0;
        for (var i = 0; i < words.length; i++) {
            var word = words[i];
            for (var j = i + 1; j < words.length; j++) {
                var s = words[j];
                if (s.startsWith(word) && s.endsWith(word)) count++;
            }
        }
        return count;
    }
}

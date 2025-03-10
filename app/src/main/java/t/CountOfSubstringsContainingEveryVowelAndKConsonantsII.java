package t;

import java.util.Map;

/**
 * https://leetcode.com/problems/count-of-substrings-containing-every-vowel-and-k-consonants-ii
 */
public class CountOfSubstringsContainingEveryVowelAndKConsonantsII {
    public long countOfSubstrings(String word, int k) {
        var is = Map.of('a', 0, 'e', 1, 'i', 2, 'o', 3, 'u', 4);
        var chars = word.toCharArray();
        var count = 0;
        for (var i = 0; i < word.length(); i++) {
            var freq = new int[6];
            var last = i;
            while (freq[5] <= k && last < word.length()) {
                var index = is.getOrDefault(chars[last++], 5);
                freq[index]++;
                if (freq[5] == k && freq[0] > 0 && freq[1] > 0 && freq[2] > 0 && freq[3] > 0 && freq[4] > 0) count++;
            }
        }
        return count;
    }
}

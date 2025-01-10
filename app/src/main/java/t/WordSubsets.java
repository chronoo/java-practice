package t;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/word-subsets
 */
public class WordSubsets {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        var result = new ArrayList<String>();
        var freq = calcFreq(words2);
        cycle: for (var word : words1) {
            var curFreq = calcFreq(word);
            for (var j = 0; j < freq.length; j++) {
                if (curFreq[j] < freq[j]) continue cycle;
            }
            result.add(word);
        }
        return result;
    }

    private static int[] calcFreq(String[] words) {
        var freq = new int[26];
        for (var word : words) {
            var freq1 = new int[26];
            for (var c : word.toCharArray()) {
                freq1[c - 'a']++;
            }
            for (var j = 0; j < freq1.length; j++) {
                if (freq1[j] > freq[j]) freq[j] = freq1[j];
            }
        }
        return freq;
    }

    private static int[] calcFreq(String words) {
        var freq = new int[26];
        for (var c : words.toCharArray()) {
            freq[c - 'a']++;
        }
        return freq;
    }
}

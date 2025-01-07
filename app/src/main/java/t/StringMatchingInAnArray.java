package t;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/string-matching-in-an-array
 */
public class StringMatchingInAnArray {
    public List<String> stringMatching(String[] words) {
        var result = new ArrayList<String>();
        for (var i = 0; i < words.length; i++) {
            if (isSubstringOfSomeoneButIt(words, words[i], i)) {
                result.add(words[i]);
            }
        }
        return result;
    }

    private static boolean isSubstringOfSomeoneButIt(String[] words, String curr, int indexToExclude) {
        for (var j = 0; j < words.length; j++) {
            if (j == indexToExclude) continue;
            var other = words[j];
            if (other.contains(curr)) return true;
        }
        return false;
    }
}

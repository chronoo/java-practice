package t;

import java.util.HashSet;

/**
 * https://leetcode.com/problems/split-a-string-into-the-max-number-of-unique-substrings
 */
public class SplitAStringIntoTheMaxNumberOfUniqueSubstrings {
    public int maxUniqueSplit(String s) {
        var unique = new HashSet<String>();
        return back(s, 0, unique);
    }

    private int back(String string, int start, HashSet<String> unique) {
        if (start == string.length()) {
            return unique.size();
        }

        var max = 0;

        for (int i = start + 1; i <= string.length(); i++) {
            var sub = string.substring(start, i);
            if (!unique.contains(sub)) {
                unique.add(sub);
                max = Math.max(max, back(string, i, unique));
                unique.remove(sub);
            }
        }
        return max;
    }
}

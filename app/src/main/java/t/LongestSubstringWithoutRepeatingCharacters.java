package t;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @link https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.isEmpty()) return 0;
        int max = 1;
        Set<Character> currs = new HashSet<>();
        for (int i = 0; i < s.length()-1; i++) {
            char start = s.charAt(i);
            currs.clear();
            int tmpMax = 1;
            for (int j = i+1; j <s.length(); j++) {
                char end = s.charAt(j);
                if (start == end || currs.contains(end)) {
                    break;
                }
                tmpMax++;
                currs.add(end);
            }
            if (tmpMax > max) {
                max = tmpMax;
            }
        }

        return max;
    }
}

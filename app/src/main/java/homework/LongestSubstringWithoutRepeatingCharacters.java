package homework;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            var letters = new HashSet<Character>();
            letters.add(s.charAt(i));
            for (int j = i + 1; j < s.length(); j++) {
                char second = s.charAt(j);
                if (!letters.contains(second)) {
                    letters.add(second);
                } else {
                    break;
                }
            }
            if (letters.size() > max) {
                max = letters.size();
            }
        }
        return max;
    }
}

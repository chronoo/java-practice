package t;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/first-unique-character-in-a-string
 */
public class FirstUniqueCharacterInAString {
    public int firstUniqChar(String s) {
        var counts = new LinkedHashMap<Character, Integer>();
        var charArray = s.toCharArray();
        for (var i = 0; i < charArray.length; i++) {
            var current = charArray[i];
            if (counts.containsKey(current)) {
                counts.put(current, -1);
            } else {
                counts.put(current, i);
            }
        }
        return counts.entrySet().stream()
                .filter(x -> x.getValue() != -1)
                .findFirst()
                .map(Map.Entry::getValue)
                .orElse(-1);
    }
}

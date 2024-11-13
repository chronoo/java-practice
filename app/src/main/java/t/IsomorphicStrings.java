package t;

import java.util.HashMap;

/**
 * https://leetcode.com/problems/isomorphic-strings
 */
public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        var map = new HashMap<Character, Character>();
        for (int i = 0; i < s.length(); i++) {
            var curS = s.charAt(i);
            var curT = t.charAt(i);
            var currentMap = map.get(curS);
            if (currentMap == null) {
                if (map.containsValue(curT)) return false;
                map.put(curS, curT);
            } else {
                if (currentMap != curT) return false;
            }
        }
        return true;
    }
}

package t;

import java.util.HashMap;

/**
 * https://leetcode.com/problems/isomorphic-strings
 */
public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        var map = new HashMap<Character, Character>();
        var sArray = s.toCharArray();
        var tArray = t.toCharArray();
        for (int i = 0; i < sArray.length; i++) {
            var curS = sArray[i];
            var curT = tArray[i];
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

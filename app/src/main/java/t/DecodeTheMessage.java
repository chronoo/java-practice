package t;

import java.util.HashMap;

/**
 * https://leetcode.com/problems/decode-the-message
 */
public class DecodeTheMessage {
    public String decodeMessage(String key, String message) {
        var replaces = new HashMap<Character, Character>();
        var last = 'a';
        for (var c : key.toCharArray()) {
            if (c != ' ' && !replaces.containsKey(c)) replaces.put(c, last++);
        }
        var sb = new StringBuilder();
        for (var c : message.toCharArray()) {
            sb.append(replaces.getOrDefault(c, c));
        }
        return sb.toString();
    }
}

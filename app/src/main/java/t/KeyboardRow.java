package t;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/keyboard-row
 */
public class KeyboardRow {
    Map<Character, Integer> map = new HashMap<>();

    {
        var rows = new String[]{"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        for (var i = 0; i < rows.length; i++) {
            var letters = rows[i].toCharArray();
            for (var letter : letters) {
                map.put(letter, i);
                map.put(Character.toUpperCase(letter), i);
            }
        }
    }

    public String[] findWords(String[] words) {
        return Arrays.stream(words)
            .filter(this::passed)
            .toArray(String[]::new);
    }

    private boolean passed(String word) {
        var i = map.get(word.charAt(0));
        for (var letter : word.toCharArray()) {
            if (map.get(letter) != i) return false;
        }
        return true;
    }
}

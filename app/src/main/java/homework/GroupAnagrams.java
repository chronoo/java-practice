package homework;

import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            map.computeIfAbsent(mapString(str), (s) -> new ArrayList<>()).add(str);
        }
        return List.copyOf(map.values());
    }

    private String mapString(String string) {
        char[] chars = string.toCharArray();
        Arrays.sort(chars);
        return String.copyValueOf(chars);
    }
}

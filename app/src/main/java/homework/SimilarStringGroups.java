package homework;

import java.util.*;

public class SimilarStringGroups {
    public int numSimilarGroups(String[] strs) {
        int count = 0;
        if (strs == null || strs.length == 0) return 0;
        Set<String> visited = new HashSet<>();
        for (String str : strs) {
            if (!visited.contains(str)) {
                dfs(str, strs, visited);
                count++;
            }
        }
        return count;
    }

    void dfs(String currentWord, String[] words, Set<String> visited) {
        if (visited.contains(currentWord)) return;
        visited.add(currentWord);
        for (String str : words)
            if (isSimilar(currentWord, str))
                dfs(str, words, visited);
    }

    public boolean isSimilar(String first, String second) {
        char[] chars1 = first.toCharArray();
        char[] chars2 = second.toCharArray();
        int diff = 0;
        for (int i = 0; i < chars1.length; i++) {
            char c1 = chars1[i];
            char c2 = chars2[i];
            if (c1 != c2) {
                diff++;
                if (diff > 2) return false;
            }
        }
        return true;
    }
}

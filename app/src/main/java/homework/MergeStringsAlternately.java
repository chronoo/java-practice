package homework;

import java.util.Iterator;

public class MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        Iterator<Integer> first = word1.chars().iterator();
        Iterator<Integer> second = word2.chars().iterator();
        while (first.hasNext() || second.hasNext()) {
            if (first.hasNext()) sb.append(Character.toString(first.next()));
            if (second.hasNext()) sb.append(Character.toString(second.next()));
        }
        return sb.toString();
    }
}

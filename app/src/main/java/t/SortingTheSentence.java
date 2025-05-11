package t;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

/**
 * https://leetcode.com/problems/sorting-the-sentence
 */
public class SortingTheSentence {
    public String sortSentence(String s) {
        return Arrays.stream(s.split(" "))
                .sorted(Comparator.comparingInt(x -> x.charAt(x.length() - 1)))
                .map(x -> x.substring(0, x.length() - 1))
                .collect(Collectors.joining());
    }
}

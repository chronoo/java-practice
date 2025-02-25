package t;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/find-words-containing-character
 */
public class FindWordsContainingCharacter {
    public List<Integer> findWordsContaining(String[] words, char x) {
        var res = new ArrayList<Integer>();
        for (var i = 0; i < words.length; i++) if (words[i].indexOf(x) > -1) res.add(i);
        return res;
    }
}

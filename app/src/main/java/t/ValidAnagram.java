package t;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/valid-anagram
 */
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        char[] charsS = s.toCharArray();
        char[] charsT = t.toCharArray();
        Arrays.sort(charsS);
        Arrays.sort(charsT);
        return Arrays.equals(charsS, charsT);
    }
}

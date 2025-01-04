package t;

/**
 * https://leetcode.com/problems/find-smallest-letter-greater-than-target
 */
public class FindSmallestLetterGreaterThanTarget {
    public char nextGreatestLetter(char[] letters, char target) {
        for (var i = 1; i < letters.length; i++) {
            var cur = letters[i];
            var prev = letters[i - 1];
            if (prev <= target && cur > target) return cur;
        }
        return letters[0];
    }
}

package t;

/**
 * https://leetcode.com/problems/find-smallest-letter-greater-than-target
 */
public class FindSmallestLetterGreaterThanTarget {
    public char nextGreatestLetter(char[] letters, char target) {
        var left = 0;
        var right = letters.length - 1;
        var ans = 0;
        while (left <= right) {
            var middle = left + (right - left) / 2;
            if (letters[middle] > target) {
                right = middle - 1;
                ans = middle;
            } else {
                left = middle + 1;
            }
        }
        return letters[ans];
    }
}

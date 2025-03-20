package t;

/**
 * https://leetcode.com/problems/permutation-difference-between-two-strings
 */
public class PermutationDifferenceBetweenTwoStrings {
    public int findPermutationDifference(String s, String t) {
        var res = new int[26];
        var charArray = s.toCharArray();
        for (var i = 0; i < charArray.length; i++) res[charArray[i] - 'a'] = i;
        var sum = 0;
        var array = t.toCharArray();
        for (var i = 0; i < array.length; i++) sum += Math.abs(res[array[i] - 'a'] - i);
        return sum;
    }
}

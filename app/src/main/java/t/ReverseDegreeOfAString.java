package t;

/**
 * https://leetcode.com/problems/reverse-degree-of-a-string
 */
public class ReverseDegreeOfAString {
    public int reverseDegree(String s) {
        var sum = 0;
        var chars = s.toCharArray();
        for (var i = 0; i < chars.length; i++) sum += ('z' - chars[i] + 1) * (i + 1);
        return sum;
    }
}

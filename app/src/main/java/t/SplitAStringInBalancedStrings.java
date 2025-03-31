package t;

/**
 * https://leetcode.com/problems/split-a-string-in-balanced-strings
 */
public class SplitAStringInBalancedStrings {
    public int balancedStringSplit(String s) {
        int ls = 0, rs = 0, count = 0;
        for (var cur : s.toCharArray()) {
            if (cur == 'L') ls++; else rs++;
            if (ls == rs) {
                count++;
                ls = rs = 0;
            }
        }
        return count;
    }
}

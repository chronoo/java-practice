package t;

/**
 * https://leetcode.com/problems/rotate-string
 */
public class RotateString {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) return false;
        if (s.equals(goal)) return true;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            var left = s.substring(0, i);
            var right = s.substring(i);
            if (goal.endsWith(left) && goal.startsWith(right)) return true;
        }
        return false;
    }
}

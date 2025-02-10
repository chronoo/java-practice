package t;

import java.util.LinkedList;

/**
 * https://leetcode.com/problems/clear-digits
 */
public class ClearDigits {
    public String clearDigits(String s) {
        var stack = new LinkedList<String>();
        for (var cur : s.toCharArray()) {
            if (cur >= '0' && cur <= '9') {
                stack.poll();
            } else {
                stack.push(String.valueOf(cur));
            }
        }
        return String.join("", stack.reversed());
    }
}

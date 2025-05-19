package t;

/**
 * https://leetcode.com/problems/remove-outermost-parentheses
 */
public class RemoveOutermostParentheses {
    public String removeOuterParentheses(String s) {
        var depth = -1;
        var sb = new StringBuilder();
        for (var cur : s.toCharArray()) {
            if (cur == '(' && ++depth > 0) sb.append(cur);
            else if (cur == ')' && depth-- > 0) sb.append(cur);
        }
        return sb.toString();
    }
}

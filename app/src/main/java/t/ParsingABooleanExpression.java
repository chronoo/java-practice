package t;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/parsing-a-boolean-expression
 */
public class ParsingABooleanExpression {
    public boolean parseBoolExpr(String expression) {
        if (expression.equals("t")) return true;
        if (expression.equals("f")) return false;
        var first = expression.charAt(0);
        var exp = expression.substring(2, expression.length() - 1);
        if (exp.replace("t", "").replace("f", "").replace(",", "").isEmpty()) {
            if (first == '!') {
                return exp.equals("f");
            }
            var args = Arrays.stream(exp.split(",")).map(x -> x.equals("t")).toList();
            if (first == '|') {
                return args.contains(true);
            }
            if (first == '&') {
                return !args.contains(false);
            }
        }
        var level = 1;
        var start = exp.indexOf('(');
        for (int i = start + 1; i < exp.length(); i++) {
            char cur = exp.charAt(i);
            if (cur == '(') {
                level++;
            }
            if (cur == ')') {
                level--;
            }
            if (level == 0) {
                String a = exp.substring(start - 1, i + 1);
                var expVal = parseBoolExpr(a);
                return parseBoolExpr(expression.replace(exp, exp.replace(a, expVal ? "t" : "f")));
            }
        }
        return parseBoolExpr(exp);
    }
}

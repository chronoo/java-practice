package t;

/**
 * https://leetcode.com/problems/add-strings
 */
public class AddStrings {
    public String addStrings(String num1, String num2) {
        var sb = new StringBuilder();
        var num1s = num1.toCharArray();
        var num2s = num2.toCharArray();
        var remain = false;
        var max = Math.max(num1s.length, num2s.length);
        for (var i = 0; i < max; i++) {
            var first = i < num1s.length ? num1s[num1s.length - i - 1] - '0' : 0;
            var second = i < num2s.length ?num2s[num2s.length - i - 1] - '0' : 0;
            var sum = first + second + (remain ? 1 : 0);
            if (sum > 9) {
                remain = true;
                sum %= 10;
            } else {
                remain = false;
            }
            sb.insert(0, sum);
        }
        return (remain ? sb.insert(0, 1) : sb).toString();
    }
}

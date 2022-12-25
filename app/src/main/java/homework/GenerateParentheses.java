package homework;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public List<String> generateParenthesis(int n)
    {
        List<String> result = new ArrayList<>();
        generate("", result, n, n);
        return result;
    }

    private void generate(String out, List<String> result, int leftLeft, int leftRight) {
        if (leftLeft == 0 && leftRight == 0) result.add(out);

        if (leftLeft > 0) {
            generate(out + "(", result, leftLeft - 1, leftRight);
        }

        if (leftLeft < leftRight) {
            generate(out + ")", result, leftLeft, leftRight - 1);
        }
    }
}

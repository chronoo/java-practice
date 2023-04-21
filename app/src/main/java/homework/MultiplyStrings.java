package homework;

import java.util.ArrayList;
import java.util.List;

public class MultiplyStrings {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) return "0";
        List<Integer> chars1 = num1.chars().map(x -> x - '0').boxed().toList();
        List<Integer> chars2 = num2.chars().map(x -> x - '0').boxed().toList();
        List<List<Integer>> res = new ArrayList<>();
        var reveal = 0;
        for (int i = 0; i < chars1.size(); i++) {
            Integer integer1 = chars1.get(chars1.size() - i - 1);
            for (int j = 0; j < chars2.size(); j++) {
                Integer integer2 = chars2.get(chars2.size() - j - 1);
                var resIndex = i+j;
                if (res.size() <= resIndex) {
                    res.add(new ArrayList<>());
                }
                var mult = reveal + integer1 * integer2;
                res.get(resIndex).add(mult % 10);
                reveal = mult / 10;
            }
            if (reveal != 0) {
                res.add(new ArrayList<>());
                res.get(res.size() - 1).add(reveal);
                reveal = 0;
            }
        }
        StringBuilder sb = new StringBuilder();
        var reveal2 = 0;
        for (List<Integer> re : res) {
            int sum = re.stream().mapToInt(Integer::intValue).sum() + reveal2;
            sb.append(sum % 10);
            reveal2 = sum/10;
        }
        if (reveal2 > 0) {
            sb.append(reveal2);
        }
        return sb.reverse().toString();
    }
}

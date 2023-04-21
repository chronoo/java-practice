package homework;

import java.util.ArrayList;
import java.util.List;

public class MultiplyStrings {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) return "0";
        int[] firstDigits = num1.chars().map(x -> x - '0').toArray();
        int[] secondDigits = num2.chars().map(x -> x - '0').toArray();
        List<List<Integer>> tempMultiplications = new ArrayList<>();
        var remainder = 0;
        for (int i = 0; i < firstDigits.length; i++) {
            Integer firstDigit = firstDigits[firstDigits.length - i - 1];
            for (int j = 0; j < secondDigits.length; j++) {
                Integer secondDigit = secondDigits[secondDigits.length - j - 1];
                var tempSumIndex = i + j;
                if (tempMultiplications.size() <= tempSumIndex) {
                    tempMultiplications.add(new ArrayList<>());
                }
                var tempMultiplication = remainder + firstDigit * secondDigit;
                tempMultiplications.get(tempSumIndex).add(tempMultiplication % 10);
                remainder = tempMultiplication / 10;
            }
            if (remainder != 0) {
                tempMultiplications.add(new ArrayList<>());
                tempMultiplications.get(tempMultiplications.size() - 1).add(remainder);
                remainder = 0;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (List<Integer> tempMultiplication : tempMultiplications) {
            int tempSum = tempMultiplication.stream().mapToInt(Integer::intValue).sum() + remainder;
            sb.append(tempSum % 10);
            remainder = tempSum / 10;
        }
        if (remainder > 0) {
            sb.append(remainder);
        }
        return sb.reverse().toString();
    }
}

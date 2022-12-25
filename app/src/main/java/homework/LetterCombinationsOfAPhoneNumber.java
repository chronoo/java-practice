package homework;

import java.util.*;

public class LetterCombinationsOfAPhoneNumber {
    public List<String> letterCombinations(String digits) {
        LinkedList<String> ans = new LinkedList<>();
        if (digits.isEmpty()) return ans;
        String[] mapping = new String[]{"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        ans.add("");
        for (int i = 0; i < digits.length(); i++) {
            int currentNumber = Character.getNumericValue(digits.charAt(i));
            while (ans.peek().length() == i) {
                String top = ans.remove();
                char[] currentKeys = mapping[currentNumber].toCharArray();
                for (char currentKey : currentKeys) {
                    ans.add(top + currentKey);
                }
            }
        }
        return ans;
    }
}

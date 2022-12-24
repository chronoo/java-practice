package homework;

import java.util.*;

public class LetterCombinationsOfAPhoneNumber {
    private static final Map<Character, List<Character>> KEYS = Map.of(
            '2', List.of('a', 'b', 'c'),
            '3', List.of('d', 'e', 'f'),
            '4', List.of('g', 'h', 'i'),
            '5', List.of('j', 'k', 'l'),
            '6', List.of('m', 'n', 'o'),
            '7', List.of('p', 'q', 'r', 's'),
            '8', List.of('t', 'u', 'v'),
            '9', List.of('w', 'x', 'y', 'z')
    );

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        List<List<Character>> keyss = new ArrayList<>();
        int[] indexces = new int[digits.length()];
        int all = 1;
        for (int i = 0; i < digits.length(); i++) {
            char currentDigit = digits.charAt(i);
            keyss.add(KEYS.get(currentDigit));
            indexces[i] = digits.length();
            all *= digits.length();
        }
        if (digits.length() == 1) {
            for (int i = 0; i < keyss.get(0).size(); i++) {
                result.add(keyss.get(0).get(i).toString());
            }
            return result;
        }

        if (digits.length() == 2) {
            for (int i = 0; i < keyss.get(0).size(); i++) {
                for (int j = 0; j < keyss.get(1).size(); j++) {
                    result.add(keyss.get(0).get(i) + "" + keyss.get(1).get(j));
                }
            }
            return result;
        }

        if (digits.length() == 3) {
            for (int i = 0; i < keyss.get(0).size(); i++) {
                for (int j = 0; j < keyss.get(1).size(); j++) {
                    for (int k = 0; k < keyss.get(2).size(); k++) {
                        result.add(keyss.get(0).get(i) + "" + keyss.get(1).get(j) + "" + keyss.get(2).get(k));
                    }
                }
            }
            return result;
        }

        if (digits.length() == 4) {
            for (int i = 0; i < keyss.get(0).size(); i++) {
                for (int j = 0; j < keyss.get(1).size(); j++) {
                    for (int k = 0; k < keyss.get(2).size(); k++) {
                        for (int l = 0; l < keyss.get(3).size(); l++) {
                            result.add(keyss.get(0).get(i) + "" + keyss.get(1).get(j) + "" + keyss.get(2).get(k) + "" + keyss.get(3).get(l));
                        }
                    }
                }
            }
            return result;
        }

        return List.of();
    }
}

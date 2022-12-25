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
        LinkedList<String> answer = new LinkedList<>();
        if (digits.isEmpty()) return answer;
        String currentAnswer = "";
        generate(currentAnswer, answer, digits, 0);
        return answer;
    }

    private void generate(String current, LinkedList<String> answer, String digits, int level) {
        if (level == digits.length()) {
            answer.add(current);
            return;
        }

        for (Character key : KEYS.get(digits.charAt(level))) {
            generate(current + key, answer, digits, level+1);
        }
    }
}

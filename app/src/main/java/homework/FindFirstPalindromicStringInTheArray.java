package homework;

import java.util.Arrays;
import java.util.stream.IntStream;

public class FindFirstPalindromicStringInTheArray {
    public String firstPalindrome(String[] words) {
        return Arrays.stream(words)
            .filter(this::isPalindrome)
            .findFirst()
            .orElse("");
    }

    private boolean isPalindrome(String word) {
        return IntStream.range(0, word.length() / 2)
            .allMatch(i -> word.charAt(i) == word.charAt(word.length() - i - 1));
    }
}

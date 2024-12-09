package t;

/**
 * https://leetcode.com/problems/reverse-vowels-of-a-string
 */
public class ReverseVowelsOfAString {
    public String reverseVowels(String s) {
        var chars = s.toCharArray();
        var start = 0;
        var end = chars.length - 1;
        while (end > start) {
            while (start < chars.length && isNotVowel(chars[start])) {
                start++;
            }
            while (end >= 0 && isNotVowel(chars[end])) {
                end--;
            }
            if (end > start) {
                var temp = chars[end];
                chars[end] = chars[start];
                chars[start] = temp;
            }
            start++;
            end--;
        }
        return String.valueOf(chars);
    }

    private boolean isNotVowel(char value) {
        return switch (value) {
            case 'a', 'e', 'i', 'o', 'u' -> false;
            case 'A', 'E', 'I', 'O', 'U' -> false;
            default -> true;
        };
    }
}

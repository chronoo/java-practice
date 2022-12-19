package homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        int maxLength = 1;
        String result = String.valueOf(s.charAt(0));

        for (int right = 1; right < s.length(); right++) {
            List<Character> chars = new ArrayList<>();
            chars.add(s.charAt(right));
            for (int left = right - 1; left >=0; left--) {
                chars.add(s.charAt(left));
                if (right - left > maxLength - 1 && isPalindrom(chars)) {
                    maxLength = right - left;
                    result = chars.stream().map(String::valueOf).collect(Collectors.joining());
                }
            }
        }
        return result;
    }

    protected boolean isPalindrom(List<Character> chars) {
        int i = 0;
        int j = chars.size()-1;
        while (j - i >= 1) {
            if (!Objects.equals(chars.get(i), chars.get(j))) return false;
            i++;
            j--;
        }
        return true;
    }
}

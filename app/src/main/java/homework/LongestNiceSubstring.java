package homework;

public class LongestNiceSubstring {
    public String longestNiceSubstring(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <= s.length(); j++) {
                String substring = s.substring(i, j);
                if (isNice(substring) && substring.length() > result.length()) {
                    result = substring;
                }
            }
        }
        return result;
    }

    private boolean isNice(String substring) {
        for (int i = 0; i < substring.length(); i++) {
            char cur = substring.charAt(i);
            if (Character.isLowerCase(cur) && substring.indexOf(Character.toUpperCase(cur)) == -1) {
                return false;
            }
            if (Character.isUpperCase(cur) && substring.indexOf(Character.toLowerCase(cur)) == -1) {
                return false;
            }
        }
        return true;
    }
}

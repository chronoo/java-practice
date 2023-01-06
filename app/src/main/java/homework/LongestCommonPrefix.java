package homework;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder prefix = new StringBuilder();
        circle: for (int i = 0; i < strs[0].length(); i++) {
            char current = strs[0].charAt(i);
            for (String str : strs) {
                if (i == str.length() || str.charAt(i) != current)  break circle;
            }
            prefix.append(current);
        }
        return prefix.toString();
    }
}

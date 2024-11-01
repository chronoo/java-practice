package t;

/**
 * https://leetcode.com/problems/delete-characters-to-make-fancy-string
 */
public class DeleteCharactersToMakeFancyString {
    public String makeFancyString(String s) {
        if (s.length() < 3) return s;
        var sb = new StringBuilder();
        char[] charArray = s.toCharArray();
        sb.append(charArray[0]);
        sb.append(charArray[1]);
        for (int i = 2; i < s.length(); i++) {
            if (charArray[i] == charArray[i-1] && charArray[i] == charArray[i-2]) continue;
            sb.append(charArray[i]);
        }
        return sb.toString();
    }
}

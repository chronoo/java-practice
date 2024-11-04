package t;

/**
 * https://leetcode.com/problems/string-compression-iii
 */
public class StringCompressionIII {
    public String compressedString(String word) {
        if (word.length() == 1) return "1" + word;
        var sb = new StringBuilder();
        char[] chars = word.toCharArray();
        int repeat = 0;
        char prev = chars[0];
        char cur = '0';
        for (int i = 1; i < chars.length; i++) {
            cur = chars[i];
            if (cur == prev && repeat < 8) {
                repeat += 1;
            } else {
                sb.append(repeat + 1);
                sb.append(prev);
                repeat = 0;
            }
            prev = cur;
        }
        sb.append(repeat + 1);
        sb.append(cur);
        return sb.toString();
    }
}

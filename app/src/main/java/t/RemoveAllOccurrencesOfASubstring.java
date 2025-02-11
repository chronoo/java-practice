package t;

/**
 * https://leetcode.com/problems/remove-all-occurrences-of-a-substring
 */
public class RemoveAllOccurrencesOfASubstring {
    public String removeOccurrences(String s, String part) {
        var res = s;
        var prev = s.length();
        do {
            prev = res.length();
            res = res.replaceFirst(part, "");
        } while (res.length() < prev);
        return res;
    }
}

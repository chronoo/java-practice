package t;

/**
 * https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
 */
public class FindTheIndexOfTheFirstOccurrenceInAString {
    public int strStr(String haystack, String needle) {
        for (int i = 0; i < haystack.length(); i++) {
            if (i + needle.length() -1 >= haystack.length()) {
                return -1;
            }
            for (int j = 0; j < needle.length(); j++) {
                char curN = needle.charAt(j);
                char curA = haystack.charAt(i + j);
                if (curN != curA) {
                    break;
                }
                if (j == needle.length()-1) {
                    return i;
                }
            }
        }
        return -1;
    }
}

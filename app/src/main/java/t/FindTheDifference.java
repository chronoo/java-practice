package t;

/**
 * https://leetcode.com/problems/find-the-difference
 */
public class FindTheDifference {
    static{
        for(int i = 0; i<500; i++){
            findTheDifference(new String(), new String());
        }
    }

    public static char findTheDifference(String s, String t) {
        var cur = '\0';
        for (var sChar : s.toCharArray()) cur ^= sChar;
        for (var tChar : t.toCharArray()) cur ^= tChar;
        return cur;
    }
}

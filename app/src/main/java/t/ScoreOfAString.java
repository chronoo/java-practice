package t;

/**
 * https://leetcode.com/problems/score-of-a-string
 */
public class ScoreOfAString {
    public int scoreOfString(String s) {
        var score = 0;
        var charArray = s.toCharArray();
        for (var i = 0; i < charArray.length - 1; i++) {
            score += Math.abs(charArray[i] - charArray[i + 1]);
        }
        return score;
    }
}

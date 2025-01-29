package t;

/**
 * https://leetcode.com/problems/find-the-town-judge
 */
public class FindTheTownJudge {
    public int findJudge(int n, int[][] trust) {
        if (trust.length == 0 && n == 1) return 1;
        var trusted = new int[n + 1];
        for (var ints : trust) {
            trusted[ints[0]]--;
            trusted[ints[1]]++;
        }
        for (var j = 0; j < trusted.length; j++) {
            if (trusted[j] == n - 1) return j;
        }
        return -1;
    }
}

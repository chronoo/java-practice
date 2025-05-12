package t;

/**
 * https://leetcode.com/problems/find-the-highest-altitude
 */
public class FindTheHighestAltitude {
    public int largestAltitude(int[] gain) {
        var max = 0;
        var acc = 0;
        for (var cur : gain) {
            acc += cur;
            max = Math.max(max, acc);
        }
        return max;
    }
}

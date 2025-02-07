package t;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/find-the-number-of-distinct-colors-among-the-balls
 */
public class FindTheNumberOfDistinctColorsAmongTheBalls {
    public int[] queryResults(int limit, int[][] queries) {
        var colors = new HashMap<Integer, Integer>();
        var balls = new HashMap<Integer, Set<Integer>>();
        var res = new int[queries.length];
        for (var i = 0; i < queries.length; i++) {
            var query = queries[i];
            var bal = query[0];
            var color = query[1];
            var prev = colors.get(bal);
            if (prev != null) {
                balls.get(prev).remove(bal);
                if (balls.get(prev).isEmpty()) {
                    balls.remove(prev);
                }
            }
            colors.put(bal, color);
            balls.putIfAbsent(color, new HashSet<>());
            var colored = balls.get(color);
            colored.add(bal);
            balls.put(color, colored);
            res[i] = balls.size();
        }
        return res;
    }
}

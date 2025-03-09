package t;

/**
 * https://leetcode.com/problems/alternating-groups-ii
 */
public class AlternatingGroupsII {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        var count = 0;
        var length = colors.length;
        cycle:
        for (var i = 0; i < length; i++) {
            for (var j = 0; j < k - 1; j++) {
                if (colors[(i + j) % colors.length] == colors[(i + j + 1) % length]) continue cycle;
            }
            count++;
        }
        return count;
    }
}

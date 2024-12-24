package t;

/**
 * https://leetcode.com/problems/alternating-groups-i
 */
public class AlternatingGroupsI {
    public int numberOfAlternatingGroups(int[] colors) {
        var count = 0;
        var size = colors.length;
        for (var i = 0; i < size; i++) {
            var left = colors[(size + i - 1) % size];
            var middle = colors[i];
            var right = colors[(i + 1) % size];
            if (left == right && middle != left) count++;
        }
        return count;
    }
}

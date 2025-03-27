package t;

import java.util.Arrays;
import java.util.Comparator;

/**
 * https://leetcode.com/problems/widest-vertical-area-between-two-points-containing-no-points
 */
public class WidestVerticalAreaBetweenTwoPointsContainingNoPoints {
    public int maxWidthOfVerticalArea(int[][] points) {
        Arrays.sort(points, Comparator.comparingInt(x -> x[0]));
        var max = 0;
        for (var i = 0; i < points.length - 1; i++) max = Math.max(max, points[i + 1][0] - points[i][0]);
        return max;
    }
}

package t;

import java.util.Arrays;
import java.util.HashMap;

/**
 * https://leetcode.com/problems/rank-transform-of-an-array
 */
public class RankTransformOfAnArray {
    public int[] arrayRankTransform(int[] arr) {
        var sorted = Arrays.stream(arr).distinct().sorted().toArray();
        var orderMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < sorted.length; i++) {
            orderMap.put(sorted[i], i + 1);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = orderMap.get(arr[i]);
        }
        return arr;
    }
}

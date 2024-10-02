package t;

import java.util.Arrays;
import java.util.HashMap;

/**
 * https://leetcode.com/problems/rank-transform-of-an-array
 */
public class RankTransformOfAnArray {
    public int[] arrayRankTransform(int[] arr) {
        var sorted = Arrays.stream(arr).sorted().distinct().boxed().toList();
        var orderMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < sorted.size(); i++) {
            var current = sorted.get(i);
            orderMap.put(current, i + 1);
        }
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            arr[i] = orderMap.get(current);
        }
        return arr;
    }
}

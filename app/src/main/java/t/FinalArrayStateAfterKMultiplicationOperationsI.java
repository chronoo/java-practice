package t;

import java.util.*;

/**
 * https://leetcode.com/problems/final-array-state-after-k-multiplication-operations-i
 */
public class FinalArrayStateAfterKMultiplicationOperationsI {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        var queue = new PriorityQueue<>(
            Comparator.<Map.Entry<Integer, Integer>>comparingInt(Map.Entry::getKey)
                .thenComparingInt(Map.Entry::getValue)
        );
        for (var i = 0; i < nums.length; i++) {
            var cur = nums[i];
            queue.offer(Map.entry(cur, i));
        }
        for (var i = 0; i < k; i++) {
            var cur = queue.poll();
            queue.offer(Map.entry(cur.getKey() * multiplier, cur.getValue()));
        }
        var res = new int[nums.length];
        while (!queue.isEmpty()) {
            var top = queue.poll();
            res[top.getValue()] = top.getKey();
        }
        return res;
    }
}

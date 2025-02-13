package t;

import java.util.PriorityQueue;

/**
 * https://leetcode.com/problems/minimum-operations-to-exceed-threshold-value-ii
 */
public class MinimumOperationsToExceedThresholdValueII {
    public int minOperations(int[] nums, int k) {
        var queue = new PriorityQueue<Long>();
        for (var num : nums) {
            queue.add((long) num);
        }
        var step = 0;
        while (queue.peek() < k) {
            var first = queue.poll();
            var second = queue.poll();
            queue.offer(first * 2 + second);
            step++;
        }
        return step;
    }
}

package t;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * https://leetcode.com/problems/find-score-of-an-array-after-marking-all-elements
 */
public class FindScoreOfAnArrayAfterMarkingAllElements {
    public long findScore(int[] nums) {
        var sum = 0L;
        var queue = new PriorityQueue<Integer>();
        var indexes = new HashMap<Integer, Queue<Integer>>();
        for (var i = 0; i < nums.length; i++) {
            var num = nums[i];
            queue.offer(num);
            indexes.putIfAbsent(num, new LinkedList<>());
            indexes.get(num).add(i);
        }
        while (!queue.isEmpty()) {
            var head = queue.poll();
            var curIndex = indexes.get(head).poll();
            if (nums[curIndex] == 0) continue;
            sum += head;
            nums[curIndex] = 0;
            if (curIndex > 0 && nums[curIndex - 1] != 0) nums[curIndex - 1] = 0;
            if (curIndex < nums.length - 1 && nums[curIndex + 1] != 0) nums[curIndex + 1] = 0;
        }
        return sum;
    }
}

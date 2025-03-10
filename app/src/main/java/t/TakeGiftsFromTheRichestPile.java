package t;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * https://leetcode.com/problems/take-gifts-from-the-richest-pile
 */
public class TakeGiftsFromTheRichestPile {
    public long pickGifts(int[] gifts, int k) {
        var queue = new PriorityQueue<>(Comparator.<Integer>reverseOrder());
        for (var gift : gifts) {
            queue.offer(gift);
        }
        for (var i = 0; i < k; i++) {
            var max = queue.poll();
            queue.offer((int) Math.sqrt(max));
        }
        var sum = 0L;
        for (var element : queue) {
            sum += element;
        }
        return sum;
    }
}

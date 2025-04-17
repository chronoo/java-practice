package t;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * https://leetcode.com/problems/count-equal-and-divisible-pairs-in-an-array
 */
public class CountEqualAndDivisiblePairsInAnArray {
    public int countPairs(int[] nums, int k) {
        var indexes = new HashMap<Integer, List<Integer>>();
        for (var i = 0; i < nums.length; i++) {
            indexes.putIfAbsent(nums[i], new ArrayList<>());
            indexes.get(nums[i]).add(i);
        }
        var sum = new AtomicInteger();
        indexes.values().stream()
            .filter(x -> x.size() > 1)
            .forEach(x -> {
                for (var i = 0; i < x.size(); i++) {
                    for (var j = i + 1; j < x.size(); j++) {
                        if ((x.get(i) * x.get(j)) % k == 0) sum.getAndIncrement();
                    }
                }
            });
        return sum.get();
    }
}

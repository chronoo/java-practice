package t;

import java.util.List;

/**
 * https://leetcode.com/problems/count-pairs-whose-sum-is-less-than-target
 */
public class CountPairsWhoseSumIsLessThanTarget {
    public int countPairs(List<Integer> nums, int target) {
        var count = 0;
        var sorted = nums.stream().sorted().toList();
        for (var i = 0; i < sorted.size(); i++) {
            var first = sorted.get(i);
            for (var j = i + 1; j < sorted.size(); j++) {
                var second = sorted.get(j);
                if (first + second < target) count++; else break;
            }
        }
        return count;
    }
}

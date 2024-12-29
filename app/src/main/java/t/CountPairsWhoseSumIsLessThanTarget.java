package t;

import java.util.Collections;
import java.util.List;

/**
 * https://leetcode.com/problems/count-pairs-whose-sum-is-less-than-target
 */
public class CountPairsWhoseSumIsLessThanTarget {
    public int countPairs(List<Integer> nums, int target) {
        var ans = 0;
        Collections.sort(nums);
        for (var i = 0; i < nums.size(); i++) {
            var left = i;
            var right = nums.size();
            var current = nums.get(i);
            while (right - left > 1) {
                var middle = left + (right - left) / 2;
                if (nums.get(middle) + current >= target) {
                    right = middle;
                } else {
                    left = middle;
                }
            }
            ans += left - i;
        }
        return ans;
    }
}

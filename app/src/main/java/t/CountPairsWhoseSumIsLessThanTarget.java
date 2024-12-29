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
            var right = nums.size() - 1;
            var current = nums.get(i);
            var res = 0;
            while (left <= right) {
                var middle = left + (right - left) / 2;
                if (nums.get(middle) + current < target) {
                    left = middle + 1;
                    res = middle - i;
                } else {
                    right = middle - 1;
                }
            }
            ans += res;
        }
        return ans;
    }
}

package t;

import java.util.Arrays;
import java.util.HashSet;

/**
 * https://leetcode.com/problems/longest-square-streak-in-an-array
 */
public class LongestSquareStreakInAnArray {
    public int longestSquareStreak(int[] nums) {
        var set = new HashSet<Integer>();
        Arrays.sort(nums);
        for (int num : nums) {
            set.add(num);
        }
        var res = -1;

        for (int num : nums) {
            var curCount = 1;
            var cur = num;
            while (set.contains(cur * cur)) {
                cur = cur * cur;
                curCount += 1;
                res = Math.max(res, curCount);
            }
        }

        return res;
    }
}

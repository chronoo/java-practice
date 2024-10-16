package t;

import java.util.HashMap;

/**
 * https://leetcode.com/problems/two-sum/
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        var diffMap = new HashMap<Integer, Integer>();
        var indexes = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int diff = target - num;
            var integer = diffMap.get(diff);
            if (integer != null) {
                return new int[]{indexes.get(integer), i};
            }
            diffMap.put(num, diff);
            indexes.put(diff, i);
        }
        throw new IllegalStateException();
    }
}

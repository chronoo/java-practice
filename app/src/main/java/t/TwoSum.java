package t;

import java.util.HashMap;

/**
 * https://leetcode.com/problems/two-sum/
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        var indexes = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            var diff = indexes.get(target - num);
            if (diff != null) {
                return new int[]{diff, i};
            }
            indexes.put(num, i);
        }
        throw new IllegalStateException();
    }
}

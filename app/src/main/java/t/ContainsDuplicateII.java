package t;

import java.util.HashMap;

/**
 * https://leetcode.com/problems/contains-duplicate-ii
 */
public class ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        var lasts = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            var cur = nums[i];
            var last = lasts.get(cur);
            if (last != null && (i - last) <= k) return true;
            lasts.put(cur, i);
        }
        return false;
    }
}

package t;

import java.util.HashSet;

/**
 * https://leetcode.com/problems/contains-duplicate
 */
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        var uniqueNums = new HashSet<Integer>();
        for (int i = 0; i < nums.length && uniqueNums.add(nums[i]); i++);
        return uniqueNums.size() != nums.length;
    }
}

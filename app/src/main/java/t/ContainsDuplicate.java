package t;

import java.util.HashSet;

/**
 * https://leetcode.com/problems/contains-duplicate
 */
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        var uniqueNums = new HashSet<Integer>();
        for (int num : nums) {
            if (!uniqueNums.add(num)) return true;
        }
        return false;
    }
}

package t;

import java.util.HashSet;

/**
 * https://leetcode.com/problems/contains-duplicate
 */
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        var was = new HashSet<Integer>();
        for (int num : nums) {
            if (was.contains(num)) return true;
            was.add(num);
        }
        return false;
    }
}

package t;

/**
 * https://leetcode.com/problems/apply-operations-to-an-array
 */
public class ApplyOperationsToAnArray {
    public int[] applyOperations(int[] nums) {
        var res = new int[nums.length];
        var out = new int[nums.length];
        for (var i = 0; i < nums.length; i++) {
            var cur = nums[i];
            if (i < nums.length - 1 && cur == nums[i + 1]) {
                res[i++] = cur * 2;
            } else {
                res[i] = cur;
            }
        }
        var i = 0;
        for (var cur : res) {
            if (cur != 0) out[i++] = cur;
        }
        return out;
    }
}

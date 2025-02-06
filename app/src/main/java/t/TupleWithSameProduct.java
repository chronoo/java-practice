package t;

import java.util.HashMap;

/**
 * https://leetcode.com/problems/tuple-with-same-product
 */
public class TupleWithSameProduct {
    public int tupleSameProduct(int[] nums) {
        var acc = 0;
        var mults = new HashMap<Integer, Integer>();
        for (var i = 0; i < nums.length; i++) {
            for (var j = i + 1; j < nums.length; j++) {
                var mult = nums[i] * nums[j];
                var currentCount = mults.getOrDefault(mult, 0);
                acc += currentCount * 8;
                mults.put(mult, currentCount + 1);
            }
        }
        return acc;
    }
}

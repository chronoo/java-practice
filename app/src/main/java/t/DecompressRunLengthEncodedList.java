package t;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/decompress-run-length-encoded-list
 */
public class DecompressRunLengthEncodedList {
    public int[] decompressRLElist(int[] nums) {
        var arrSize = 0;
        for (var i = 0; i < nums.length; i += 2) arrSize += nums[i];
        var result = new int[arrSize];
        var startIdx = 0;
        for (var i = 0; i < nums.length; i += 2) {
            Arrays.fill(result, startIdx, startIdx + nums[i], nums[i + 1]);
            startIdx += nums[i];
        }
        return result;
    }
}

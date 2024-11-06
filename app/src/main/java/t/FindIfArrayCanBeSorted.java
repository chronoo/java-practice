package t;

/**
 * https://leetcode.com/problems/find-if-array-can-be-sorted
 */
public class FindIfArrayCanBeSorted {
    public boolean canSortArray(int[] nums) {
        int prevMax = Integer.MIN_VALUE;
        int currMax = Integer.MIN_VALUE;
        int currMin = Integer.MAX_VALUE;
        int prevBytes = 0;
        for (int current : nums) {
            int curBytes = countBytes(current);
            if (curBytes == prevBytes) {
                currMax = Math.max(currMax, current);
                currMin = Math.min(currMin, current);
            } else {
                if (currMin < prevMax) return false;
                prevMax = currMax;
                currMin = current;
                currMax = current;
                prevBytes = curBytes;
            }
        }
        return currMin > prevMax;
    }

    private int countBytes(int number) {
        return ((number & 1) == 1 ? 1 : 0) + ((number & 2) == 2 ? 1 : 0) + ((number & 4) == 4 ? 1 : 0) + ((number & 8) == 8 ? 1 : 0) + ((number & 16) == 16 ? 1 : 0) + ((number & 32) == 32 ? 1 : 0) + ((number & 64) == 64 ? 1 : 0) + ((number & 128) == 128 ? 1 : 0) + ((number & 256) == 256 ? 1 : 0);
    }
}

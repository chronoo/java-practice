package t;

/**
 * https://leetcode.com/problems/partition-array-according-to-given-pivot
 */
public class PartitionArrayAccordingToGivenPivot {
    public int[] pivotArray(int[] nums, int pivot) {
        var first = new int[nums.length];
        var second = new int[nums.length];
        var same = new int[nums.length];
        var res = new int[nums.length];
        int firstI = 0, secondI = 0, sameI = 0;
        for (var num : nums) {
            if (num < pivot) first[firstI++] = num;
            else if (num > pivot) second[secondI++] = num;
            else same[sameI++] = pivot;
        }
        if (firstI >= 0) System.arraycopy(first, 0, res, 0, firstI);
        if (sameI >= 0) System.arraycopy(same, 0, res, firstI, sameI);
        if (secondI >= 0) System.arraycopy(second, 0, res, firstI + sameI, secondI);
        return res;
    }
}

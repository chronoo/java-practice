package homework;

import java.util.Arrays;
public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int[] uniqueNums = Arrays.stream(nums).distinct().toArray();
        System.arraycopy(uniqueNums, 0, nums, 0, uniqueNums.length);
        return uniqueNums.length;
    }
}
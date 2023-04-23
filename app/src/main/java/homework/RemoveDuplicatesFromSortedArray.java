package homework;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int currentNumIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[currentNumIndex] != nums[i]) {
                nums[++currentNumIndex] = nums[i];
            }
        }
        System.gc();
        return currentNumIndex+1;
    }
}
package homework;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int currentNum = nums[0];
        int currentNumIndex = 1;
        for (int i = 1; i < nums.length; i++) {
            int tempNum = nums[i];
            if (tempNum > currentNum) {
                nums[currentNumIndex] = tempNum;
                currentNumIndex++;
                currentNum = tempNum;
            }
        }
        return currentNumIndex;
    }
}
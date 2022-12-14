package homework;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while (l < r) {
            int med = (l + r) / 2;
            if (target <= nums[med]) r = med;
            else l = med + 1;
        }
        return nums[l] >= target ? l : l + 1;
    }
}

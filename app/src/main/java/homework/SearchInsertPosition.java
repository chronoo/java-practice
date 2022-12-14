package homework;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            int med = l + (r - l) / 2;
            if (target == nums[med]) return med;
            if (target > nums[med]) l = med + 1;
            else r = med - 1;
        }
        return l;
    }
}

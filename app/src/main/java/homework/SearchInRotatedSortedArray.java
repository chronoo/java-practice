package homework;

public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int median = left + (right - left)/2;
            if (nums[median] == target)
                return median;
            else if (nums[median] > target) {
                if (nums[median] > nums[right] && nums[left] > target)
                    left = median + 1;
                else
                    right = median - 1;
            } else {
                 if (nums[median] < nums[left] && nums[left] <= target)
                     right = median - 1;
                 else
                     left = median + 1;
            }
        }
        return -1;
    }
}

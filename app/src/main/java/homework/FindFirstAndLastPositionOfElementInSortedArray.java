package homework;

public class FindFirstAndLastPositionOfElementInSortedArray {
    public int[] searchRange(int[] nums, int target) {
        if (nums == null || nums.length == 0 || nums[nums.length - 1] < target || nums[0] > target) {
            return new int[]{-1, -1};
        }
        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            if (current > target) break;
            if (current == target) {
                int j = i;
                boolean isGreat = false;
                do {
                    j++;
                } while (j < nums.length && nums[j] == target);
                if (j == nums.length || nums[j] > target)
                    isGreat = true;
                return new int[]{i, isGreat ? --j: j};
            }
        }
        return new int[]{-1, -1};
    }
}

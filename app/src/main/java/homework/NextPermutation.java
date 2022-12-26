package homework;

public class NextPermutation {
    public void nextPermutation(int[] nums) {
        int left = nums.length - 2;
        int right = nums.length - 1;
        boolean reach = false;
        for (; right > 0; right--) {
            if (nums[right] > nums[left]) {
                reach = true;
                break;
            }
        }
        int tempRight = nums[right];

        if (reach) {
            nums[right] = nums[right - 1];
            nums[right - 1] = tempRight;
        } else {
            int[] temp = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                temp[nums.length - 1 - i] = nums[i];
            }
            System.arraycopy(temp, 0, nums, 0, nums.length);
        }
    }
}

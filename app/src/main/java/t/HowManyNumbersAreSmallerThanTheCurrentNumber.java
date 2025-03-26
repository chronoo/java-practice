package t;

import java.util.Arrays;

public class HowManyNumbersAreSmallerThanTheCurrentNumber {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] res = new int[nums.length];
        int[] copy = Arrays.copyOf(nums, nums.length);
        Arrays.sort(copy);
        for (int j = 0; j < nums.length; j++) {
            int num = nums[j];
            var count = 0;
            for (int i : copy) {
                if (i >= num) break;
                count++;
            }
            res[j] = count;
        }
        return res;
    }
}

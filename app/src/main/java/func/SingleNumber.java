package func;

import java.util.Arrays;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            int current = nums[i];
            int next = nums[i + 1];
            if (current != next &&(i==0 || (nums[i - 1] != current))){
                return current;
            }
        }
        return nums[nums.length - 1];
    }
}

package homework;

import java.util.Arrays;

public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int aprox = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    int currentAprox = nums[i] + nums[k] + nums[j];
                    if (Math.abs(currentAprox - target) < Math.abs(aprox - target)) {
                        aprox = currentAprox;
                    }
                }
            }
        }
        return aprox;
    }
}

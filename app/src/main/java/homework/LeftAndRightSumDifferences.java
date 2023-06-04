package homework;

import java.util.Arrays;

public class LeftAndRightSumDifferences {
    public int[] leftRightDifference(int[] nums) {
        int[] result = new int[nums.length];
        int leftSum = 0;
        int rightSum = Arrays.stream(nums).sum();
        for (int i = 0; i < nums.length; i++) {
            int currentNum = nums[i];
            rightSum -= currentNum;
            result[i] = Math.abs(leftSum - rightSum);
            leftSum += currentNum;
        }
        return result;
    }
}

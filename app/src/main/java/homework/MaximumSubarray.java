package homework;

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int subarraySum = Integer.MIN_VALUE;
        int sum = 0;
        for (int num : nums) {
            sum += num;
            if (subarraySum < sum) subarraySum = sum;
            if (sum < 0) sum = 0;
        }
        return subarraySum;
    }
}

package func;

public class BinarySubarraysWithSum {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int count = 0;
        for (int left = 0; left < nums.length; left++) {
            int sum = nums[left];

            for (int right = left; right < nums.length && sum <= goal; right++) {
                if (right!=left) sum += nums[right];
                if (sum == goal) count++;
            }
        }
        return count;
    }
}

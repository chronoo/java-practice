package homework;

public class CountNumberOfNiceSubarrays {
    public int numberOfSubarrays(int[] nums, int k) {
        int count = 0;
        for (int left = 0; left < nums.length; left++) {
            int odds = 0;
            for (int right = left; right < nums.length; right++) {
                if (nums[right] % 2 == 1) {
                    odds++;
                }
                if (odds == k) count++;
                else if (odds > k) break;
            }
        }
        return count;
    }
}

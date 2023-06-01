package homework;

public class CountNumberOfNiceSubarrays {
    public int numberOfSubarrays(int[] nums, int k) {
        int i = 0, odd = 0, count = 0, res = 0;
        for (int num : nums) {
            if (num % 2 == 1) {
                odd++;
                count = 0;
            }
            for (; odd == k; i++, count++) {
                if (nums[i] % 2 == 1) {
                    odd--;
                }
            }
            res += count;
        }
        return res;
    }
}

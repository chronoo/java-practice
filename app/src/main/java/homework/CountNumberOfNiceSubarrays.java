package homework;

public class CountNumberOfNiceSubarrays {
    public int numberOfSubarrays(int[] nums, int k) {
        int i = 0, j = 0, odd = 0, count = 0, res = 0;
        while (j < nums.length) {
            if (nums[j] % 2 == 1) {
                odd++;
                count = 0;
            }
            while (odd == k) {
                if (nums[i++] % 2 == 1) {
                    odd--;
                }
                count++;
            }
            res += count;
            j++;
        }
        return res;
    }
}

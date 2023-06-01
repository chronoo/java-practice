package homework;

public class CountNumberOfNiceSubarrays {
    public int numberOfSubarrays(int[] nums, int k) {
        int count = 0, ans = 0;
        int[] arr = new int[nums.length];
        for (int x : nums) {
            arr[count]++;
            if (x % 2 == 1) count++;
            if (count >= k) ans += arr[count - k];
        }
        return ans;
    }
}

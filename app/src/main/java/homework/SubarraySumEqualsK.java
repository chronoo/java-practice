package homework;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int currSum = 0;
        Map<Integer, Integer> h = new HashMap<>();
        h.put(0, 1);

        for (int num : nums) {
            currSum += num;

            if (h.containsKey(currSum - k))
                count += h.get(currSum - k);

            int newVal = h.getOrDefault(currSum, 0);
            h.put(currSum, newVal + 1);
        }

        return count;
    }

    public int subarraySum2(int[] nums, int k) {
        int count = 0;
        for (int l = 0; l < nums.length; l++) {
            int sum = 0;
            for (int r = l; r < nums.length; r++) {
                sum += nums[r];
                if (sum == k) count++;
            }
        }
        return count;
    }
}

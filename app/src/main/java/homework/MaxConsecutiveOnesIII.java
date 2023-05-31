package homework;

import java.util.ArrayList;
import java.util.List;

public class MaxConsecutiveOnesIII {
    public int longestOnes(int[] nums, int k) {
        List<Integer> zeros = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (num == 0) {
                zeros.add(i);
            }
        }
        if (zeros.size() <= k) return nums.length;
        int max = 0;
        for (int i = 0; i <= zeros.size() - k; i++) {
            List<Integer> copy = new ArrayList<>();
            copy.add(-1);
            for (int j = 0; j < zeros.size(); j++) {
                if (j < i || j > i + k - 1) {
                    copy.add(zeros.get(j));
                }
            }
            copy.add(nums.length);
            for (int j = 0; j < copy.size() - 1; j++) {
                int sum = copy.get(j + 1) - copy.get(j);
                if (sum > max) max = sum - 1;
            }
        }
        return max;
    }
}

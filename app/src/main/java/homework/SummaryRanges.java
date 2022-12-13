package homework;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        int right = 0;
        int left = 0;

        while (left < nums.length) {
            while (right < nums.length && right - left == nums[right] - nums[left]) {
                right++;
            }

            res.add(right - left == 1 ? String.valueOf(nums[left]) : nums[left] + "->" + nums[right-1]);
            left = right;
        }
        return res;
    }

    public List<String> summaryRanges3(int[] nums) {
        int start = 0;
        List<String> res = new ArrayList<>();
        while (start < nums.length) {
            int end = start + 1;

            while (end < nums.length && end - start == nums[end] - nums[start]) {
                end++;
            }

            if (end == start + 1) {
                res.add(String.valueOf(nums[start]));
            } else {
                res.add(nums[start] + "->" + nums[end - 1]);
            }

            start = end;
        }
        return res;
    }

    public List<String> summaryRanges2(int[] nums) {
        if (nums.length == 0) return List.of();
        List<String> result = new ArrayList<>();
        int rangeStart = nums[0];
        int rangeEnd = nums[0];
        for (int i = 0; i <= nums.length; i++) {
            if (i == 0 || i < nums.length && nums[i] - nums[i - 1] == 1) {
                rangeEnd = nums[i];
            } else {
                result.add(rangeStart == rangeEnd ? String.valueOf(rangeStart) : rangeStart + "->" + rangeEnd);
                if (i < nums.length) {
                    rangeStart = nums[i];
                    rangeEnd = nums[i];
                }
            }
        }
        return result;
    }
}

package homework;

import java.util.*;

public class IVSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums.length < 4) return result;
        Arrays.sort(nums);
        if (nums[0] == nums[nums.length - 1] && (long) nums[0] * 4 == target)
            return List.of(List.of(nums[0], nums[0], nums[0], nums[0]));
        List<Integer> current = new ArrayList<>();
        generate(result, nums, target, 0, 0, current, 0);
        return new ArrayList<>(result);
    }

    private void generate(List<List<Integer>> result, int[] nums, int target, int level, int currentIndex, List<Integer> current, int sum) {
        if (level == 4) {
            if (sum == target && !result.contains(current)) {
                result.add(new ArrayList<>(current));
            }
            return;
        }

        for (int i = currentIndex; i < nums.length; i++) {
            if (nums[i] + (long) nums[nums.length - 1] * (3 - current.size()) + sum < target) continue;
            if (nums[i] * (long) (4 - current.size()) + sum > target)
                return;
            current.add(nums[i]);
            generate(result, nums, target, level + 1, i + 1, current, sum + nums[i]);
            current.remove(current.size() - 1);
        }
    }
}

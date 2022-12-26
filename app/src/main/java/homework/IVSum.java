package homework;

import java.util.*;

public class IVSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> result = new HashSet<>();
        if (nums.length < 4) return List.of();
        Arrays.sort(nums);
        List<Integer> current = new ArrayList<>();
        generate(result, nums, target, 0, 0, current, 0);
        return new ArrayList<>(result);
    }

    private void generate(Set<List<Integer>> result, int[] nums, int target, int level, int currentIndex, List<Integer> current, int sum) {
        if (level == 4) {
            if (sum == target) {
                result.add(current);
            }
            return;
        }

        for (int i = currentIndex; i < nums.length; i++) {
            generate(result, nums, target, level + 1, i + 1, addToList(current, nums[i]), sum + nums[i]);
        }
    }

    private List<Integer> addToList(List<Integer> list, int num) {
        ArrayList<Integer> result = new ArrayList<>(list);
        result.add(num);
        return result;
    }
}

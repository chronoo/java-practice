package homework;

import java.util.*;
import java.util.stream.Collectors;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if(nums.length < 3) return result;
        Arrays.sort(nums);
        int i = 0;
        while(i < nums.length - 2) {
            if(nums[i] > 0) break;
            int j = i + 1;
            int k = nums.length - 1;
            while(j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == 0) result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                if(sum <= 0) while(nums[j] == nums[++j] && j < k);
                if(sum >= 0) while(nums[k--] == nums[k] && j < k);
            }
            while(nums[i] == nums[++i] && i < nums.length - 2);
        }
        return result;
    }

    public List<List<Integer>> threeSum3(int[] nums) {
        List<Integer> tempList = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toList());

        Set<List<Integer>> res = new HashSet<>();
        Set<Integer> firsts = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            int first = nums[i];
            if (firsts.contains(first)) continue;
            else firsts.add(first);
            Set<Integer> seconds = new HashSet<>();
            for (int j = i + 1; j < nums.length; j++) {
                int second = nums[j];
                if (seconds.contains(second)) continue;
                int third = -first - second;
                int index = tempList.lastIndexOf(third);
                if (index > j) {
                    List<Integer> list = new ArrayList<>(List.of(first, second, third));
                    list.sort(Integer::compareTo);
                    res.add(list);
                    seconds.add(second);
                }
            }
        }

        return new ArrayList<>(res);
    }

    public List<List<Integer>> threeSum2(int[] nums) {
        Set<List<Integer>> res = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            int first = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                int second = nums[j];
                for (int k = j + 1; k < nums.length; k++) {
                    int third = nums[k];
                    if (first + second + third == 0) {
                        List<Integer> list = new ArrayList<>(List.of(first, second, third));
                        list.sort(Integer::compareTo);
                        res.add(list);
                    }
                }
            }
        }

        return new ArrayList<>(res);
    }
}

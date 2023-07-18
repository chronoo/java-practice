package homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Arrays.sort(candidates);
        combination2(0, candidates, target, res, list);
        return res;
    }

    public void combination2(int index, int[] arr, int target, List<List<Integer>> res, List<Integer> list) {
        if (target == 0) {
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = index; i < arr.length; i++) {
            int current = arr[i];
            if (i > index && current == arr[i - 1]) continue;
            if (current > target) break;

            list.add(current);
            combination2(i + 1, arr, target - current, res, list);
            list.remove(list.size() - 1);
        }
    }
}

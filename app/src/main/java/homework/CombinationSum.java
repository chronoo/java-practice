package homework;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        solve(result, new ArrayList<>(), candidates, target, 0, 0);
        return result;
    }

    private void solve(List<List<Integer>> result, List<Integer> current, int[] candidates, int target, int sum, int index) {
        if (sum > target) return;
        if (sum == target) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = index; i < candidates.length; i++) {
            int candidate = candidates[i];
            current.add(candidate);
            solve(result, current, candidates, target, sum + candidate, i);
            current.remove(current.size() - 1);
        }
    }
}

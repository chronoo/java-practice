package t;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/all-paths-from-source-to-target
 */
public class AllPathsFromSourceToTarget {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        var res = new ArrayList<List<Integer>>();
        dfs(res, graph, 0, new ArrayList<>(0));
        return res;
    }

    private void dfs(List<List<Integer>> res, int[][] graph, int index, List<Integer> current) {
        var copy = new ArrayList<>(current);
        copy.add(index);
        if (index == graph.length - 1) {
            res.add(copy);
            return;
        }
        for (var vertex : graph[index]) {
            dfs(res, graph, vertex, copy);
        }
    }
}

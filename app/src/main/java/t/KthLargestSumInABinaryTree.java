package t;

import homework.PathSumII.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/kth-largest-sum-in-a-binary-tree
 */
public class KthLargestSumInABinaryTree {
    public long kthLargestLevelSum(TreeNode root, int k) {
        Map<Long, Long> sums = new HashMap<>();
        dep(root, sums, 0);
        if (k > sums.size()) return -1;
        return sums.values().stream().sorted().toList().reversed().get(k - 1);
    }

    private void dep(TreeNode root, Map<Long, Long> sums, long level) {
        sums.put(level, sums.getOrDefault(level, 0L) + root.val);
        if (root.left == null && root.right == null) {
            return;
        }
        if (root.left != null) {
            dep(root.left, sums, level + 1);
        }
        if (root.right != null) {
            dep(root.right, sums, level + 1);
        }
    }
}

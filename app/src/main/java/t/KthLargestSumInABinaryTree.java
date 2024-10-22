package t;

import homework.PathSumII.TreeNode;

import java.util.*;

/**
 * https://leetcode.com/problems/kth-largest-sum-in-a-binary-tree
 */
public class KthLargestSumInABinaryTree {
    public long kthLargestLevelSum(TreeNode root, int k) {
        var sums = new PriorityQueue<Long>(Collections.reverseOrder());
        var queue = new ArrayList<TreeNode>();
        queue.add(root);

        while (!queue.isEmpty()) {
            var newLevel = new ArrayList<TreeNode>();
            var sum = 0L;
            for (var treeNode : queue) {
                sum += treeNode.val;
                if (treeNode.left != null) newLevel.add(treeNode.left);
                if (treeNode.right != null) newLevel.add(treeNode.right);
            }
            sums.add(sum);
            queue = newLevel;
        }

        if (sums.size() < k) return -1;
        for (int i = k - 1; i > 0; i--) {
            sums.poll();
        }
        return sums.peek();
    }
}

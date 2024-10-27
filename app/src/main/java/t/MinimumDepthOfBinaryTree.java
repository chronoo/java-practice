package t;

import func.TreeNode;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * https://leetcode.com/problems/minimum-depth-of-binary-tree/
 */
public class MinimumDepthOfBinaryTree {
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        AtomicInteger min = new AtomicInteger(Integer.MAX_VALUE);
        min(root, min, 1);
        return min.get();
    }

    public void min(TreeNode node, AtomicInteger min, int level) {
        if (node == null || node.left == null &&  node.right == null) {
            if (level < min.get()) min.set(level);
            return;
        }
        if (node.left!= null) min(node.left, min, level + 1);
        if (node.right!= null) min(node.right, min, level + 1);
    }
}
